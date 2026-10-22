# Minecrafteando

Aquí guardo los mods de Minecraft que voy haciendo mientras aprendo Java y pruebo cosas con Fabric y Forge.

## Proyectos

- **[Tomatazo](mods/fabric/primer-mod/)**: cultivos de tomate, semillas y tomates que se pueden comer o lanzar.
- **[Mods para Forge 1.20.1](mods/forge/)**: notas y versiones de Gremlin, Ruby/REFORCED, Mochilas + Hornos y Mazmorras de Duendes. Los binarios originales no están publicados en este repositorio.

## Organización

- `mods/fabric/primer-mod/`: proyecto Java de Tomatazo, con Gradle, recursos y capturas.
- `mods/forge/`: inventario de los mods de Forge y hashes de los archivos recuperados.
- `apuntes/`: apuntes y cosas que quiero seguir practicando.

## Compilar Tomatazo

Necesitas un JDK compatible con el proyecto y conexión para descargar las dependencias de Gradle.

```bash
cd mods/fabric/primer-mod
./gradlew build
```

El resultado se genera en `build/libs/` si la compilación termina correctamente.

Todavía tengo pendientes las pruebas de compatibilidad de los distintos mods en una instalación real de Minecraft.
