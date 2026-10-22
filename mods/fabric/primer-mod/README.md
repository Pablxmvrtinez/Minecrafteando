# Tomatazo

Un mod de Fabric para añadir tomates a Minecraft. Puedes cultivarlos, comerlos y también tirárselos a otras entidades.

## Qué lleva

- Semillas que pueden encontrarse en cofres de aldeas.
- Cultivo en tierra arada, con crecimiento y uso de polvo de hueso.
- Cosecha que deja tomates y semillas.
- Tomates comestibles.
- Lanzamiento con **Shift + clic derecho**. El proyectil aplica efectos al impactar en determinadas zonas de una entidad.
- Texturas, modelos y nombres en español e inglés.

## Código

El proyecto está hecho con Java, Fabric API y Gradle. Puedes revisar las clases de los ítems, el cultivo y el proyectil en `src/main/java/`, y sus recursos en `src/main/resources/`.

Para compilarlo desde esta carpeta:

```bash
./gradlew build
```

Hace falta tener instalado el JDK adecuado para la versión del proyecto. La compilación y el funcionamiento en el juego son comprobaciones distintas.

## Capturas

![Cultivo de tomate](capturas/cultivo-tomate.png)

![Tomate lanzado](capturas/tomate-lanzado.png)
