"""Comprueba el JAR distribuible de Tomatazo después de compilarlo.

Uso: python3 scripts/check_jar.py
"""
import json
from pathlib import Path
import sys
from zipfile import BadZipFile, ZipFile

ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / "build/libs"


def main():
    jars = sorted(
        path for path in OUTPUT.glob("*.jar")
        if not path.name.endswith(("-sources.jar", "-dev.jar"))
    )
    if len(jars) != 1:
        raise ValueError(f"Se esperaba un JAR distribuible, encontrados {len(jars)}.")

    jar = jars[0]
    try:
        with ZipFile(jar) as bundle:
            contents = set(bundle.namelist())
            if bundle.testzip() is not None:
                raise ValueError("JAR dañado: error de integridad ZIP.")
            manifest = json.loads(bundle.read("fabric.mod.json").decode("utf-8"))
            if manifest.get("id") != "tomatazo":
                raise ValueError("El JAR no contiene el mod id correcto.")
            version = manifest.get("version", "")
            if not isinstance(version, str) or not version or (chr(36) + "{") in version:
                raise ValueError("La versión del mod no se expandió correctamente.")

            for layer, classes in manifest.get("entrypoints", {}).items():
                for fullname in classes:
                    compiled = fullname.replace(".", "/") + ".class"
                    if compiled not in contents:
                        raise ValueError(f"Falta la clase de entrada {fullname}.")

            required = {
                "assets/tomatazo/icon.png",
                "assets/tomatazo/lang/es_es.json",
                "assets/tomatazo/lang/en_us.json",
                "assets/tomatazo/items/tomate.json",
                "assets/tomatazo/items/semillas_tomate.json",
                "assets/tomatazo/blockstates/cultivo_tomate.json",
            }
            absent = sorted(required - contents)
            if absent:
                raise ValueError("Faltan recursos: " + ", ".join(absent))

    except (BadZipFile, KeyError, UnicodeError, json.JSONDecodeError) as exc:
        raise ValueError("El JAR no contiene metadatos válidos.") from exc

    print("JAR validado:", jar.name)
    print("Versión:", version)
    print("Clases de entrada, icono, traducciones y modelos: presentes")
    print("Nota: la validación no sustituye iniciar Minecraft.")


if __name__ == "__main__":
    try:
        main()
    except (ValueError, OSError) as error:
        print("Error al validar JAR:", error, file=sys.stderr)
        raise SystemExit(1)
