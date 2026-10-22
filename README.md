# Minecrafteando

Repositorio dedicado al desarrollo y aprendizaje de **mods de Minecraft** con Java. Aquí encontrarás proyectos con código fuente, documentación de ideas y notas para seguir avanzando con Fabric y Forge.

## ¿Qué encontrarás aquí?

### Tomatazo (Fabric)

En [Tomatazo](mods/fabric/primer-mod/) puedes consultar el código y los recursos de un mod que añade tomates como cultivo y objeto que se puede comer o lanzar. El proyecto incluye capturas para entender su funcionamiento.

### Proyectos Forge 1.20.1

En la [carpeta de Forge](mods/forge/) se documentan otras ideas de mods: Gremlin, Ruby/REFORCED, Mochilas + Hornos y Mazmorras de Duendes. **Aquí no están publicados los JAR originales** de esos proyectos, por lo que su documentación no equivale a una descarga instalable.

## Cómo compilar Tomatazo

Para generar el archivo del mod desde el código fuente necesitas Java (la versión de JDK requerida por el proyecto), Gradle mediante el wrapper incluido y una conexión a Internet para descargar dependencias.

1. Descarga o clona este repositorio.
2. Abre una terminal en la carpeta `mods/fabric/primer-mod`.
3. Ejecuta:

```bash
cd mods/fabric/primer-mod
./gradlew build
```

En Windows, utiliza `gradlew.bat build` en lugar de `./gradlew build`. Si la compilación termina correctamente, encontrarás el resultado en `mods/fabric/primer-mod/build/libs/`.

**Antes de instalar el JAR:** comprueba la versión de Minecraft, la de Fabric y las dependencias declaradas por el proyecto. No asumas que funcionará en cualquier versión.

## Organización del repositorio

- [`mods/fabric/primer-mod/`](mods/fabric/primer-mod/): código fuente y recursos de Tomatazo.
- [`mods/forge/`](mods/forge/): documentación sobre los proyectos Forge.
- [`apuntes/`](apuntes/plan-aprendizaje-modding.md): notas de aprendizaje para el desarrollo de mods.

## Estado y próximos pasos

Es un repositorio de **aprendizaje y experimentación**, no una colección de mods terminados. El siguiente trabajo consiste en mejorar mecánicas, probar versiones reales de Minecraft y recuperar o reconstruir el código fuente de los proyectos Forge.

Si quieres entender por dónde empezar, empieza por [los apuntes](apuntes/plan-aprendizaje-modding.md) y después revisa el código de Tomatazo.
