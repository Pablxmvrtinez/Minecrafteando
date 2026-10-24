"""Comprueba que los requisitos declarados por Tomatazo coinciden con Gradle.

Uso (desde la raíz del mod): python scripts/check_metadata.py
"""
import json
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parents[1]


def properties(path):
    output = {}
    for line in path.read_text(encoding="utf-8").splitlines():
        clean = line.strip()
        if clean and not clean.startswith("#") and "=" in clean:
            key, value = clean.split("=", 1)
            output[key.strip()] = value.strip()
    return output


def main():
    props = properties(ROOT / "gradle.properties")
    meta = json.loads((ROOT / "src/main/resources/fabric.mod.json").read_text(encoding="utf-8"))
    build = (ROOT / "build.gradle").read_text(encoding="utf-8")
    settings = (ROOT / "settings.gradle").read_text(encoding="utf-8")

    assert meta["id"] == "tomatazo", "El mod ID no es tomatazo."
    assert "'tomatazo'" in settings, "Nombre del proyecto Gradle incorrecto."
    assert '"tomatazo"' in build, "El id de Loom no coincide."
    required = meta["depends"]
    assert required["minecraft"] == "=" + props["minecraft_version"], (
        "La versión de Minecraft declarada no coincide con Gradle."
    )
    assert required["fabricloader"] == ">=" + props["loader_version"], (
        "La versión mínima de Fabric Loader no coincide con la compilada."
    )

    match = re.search(r"options\.release\s*=\s*(\d+)", build)
    assert match, "No se encuentra la versión Java de la compilación."
    assert required["java"] == ">=" + match.group(1), (
        "La versión mínima de Java no coincide con Gradle."
    )

    for layer, classes in meta.get("entrypoints", {}).items():
        source = ROOT / ("src/client/java" if layer == "client" else "src/main/java")
        for cls in classes:
            path = source / (cls.replace(".", "/") + ".java")
            assert path.is_file(), f"Falta el punto de entrada: {cls}"

    print("Metadatos correctos:",
          "Minecraft", props["minecraft_version"],
          "/ Fabric Loader", props["loader_version"],
          "/ Java", match.group(1))
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except (AssertionError, KeyError, ValueError) as exc:
        print("Metadatos incorrectos:", exc, file=sys.stderr)
        raise SystemExit(1)
