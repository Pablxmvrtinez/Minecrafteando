# Minecrafteando

**Mi espacio para aprender a crear mods de Minecraft con Java.**

Este repositorio reúne código, recursos y documentación de proyectos desarrollados con **Fabric** y **Forge**. Su objetivo es que puedas encontrar rápidamente qué mod tiene código disponible, qué parte está documentada y cómo compilar lo que ya existe.

## Empieza por aquí

| Proyecto | ¿Qué encontrarás? | Estado |
| --- | --- | --- |
| [Tomatazo (Fabric)](mods/fabric/primer-mod/) | Código Java, cultivo, tomates comestibles y arrojadizos, recursos y capturas | Código disponible para estudiar y compilar |
| [Mods Forge 1.20.1](mods/forge/) | Documentación de Gremlin, Ruby/REFORCED, mochilas y mazmorras | Sin JAR originales publicados |
| [Apuntes de modding](apuntes/plan-aprendizaje-modding.md) | Notas de aprendizaje y conceptos | Material de consulta |

### Compilar el mod Tomatazo

Necesitas el **JDK compatible con la configuración Gradle del mod** y conexión a Internet para descargar las dependencias por primera vez.

1. Descarga o clona este repositorio.
2. Abre una terminal dentro de la carpeta `mods/fabric/primer-mod`.
3. Ejecuta el wrapper de Gradle incluido:

**Linux:**
~~~bash
cd mods/fabric/primer-mod
./gradlew build
~~~

**Windows (PowerShell):**
~~~powershell
cd mods\fabric\primer-mod
.\gradlew.bat build
~~~

Si la compilación termina sin errores, busca el JAR en `mods/fabric/primer-mod/build/libs/`. Antes de usarlo, comprueba las versiones de Minecraft, Fabric y las dependencias definidas en el proyecto: no todos los JAR funcionan en todas las versiones.

### Qué hace Tomatazo

El mod explora varias mecánicas a partir de un objeto sencillo:

- **Cultivo:** plantar tomates y obtenerlos como cosecha.
- **Comida:** utilizar tomates como alimento.
- **Objeto arrojadizo:** lanzar tomates con un efecto sobre el objetivo.

El código y los recursos están en [la carpeta de Tomatazo](mods/fabric/primer-mod/). Las capturas y el propio código son la referencia para saber qué partes están implementadas.

### ¿Y los proyectos Forge?

La carpeta [`mods/forge/`](mods/forge/) contiene explicaciones de otros conceptos: nuevos minerales y equipamiento, mochilas y mejoras, criaturas con mecánicas propias y mazmorras. **No equivale a un instalador ni a una colección de mods descargables.** Es documentación de proyectos que requieren recuperar o reconstruir fuentes y hacer pruebas de compatibilidad.

## Organización de archivos

~~~text
mods/
  fabric/primer-mod/    Código y recursos de Tomatazo
  forge/                Documentación Forge
apuntes/                Material de aprendizaje
~~~

## Limitaciones y próximos pasos

Esta es una colección de aprendizaje, no una suite de mods terminados. Las tareas pendientes incluyen probar los resultados en versiones reales de Minecraft, mejorar las mecánicas y preparar publicaciones cuando los proyectos tengan compilaciones verificadas.

Para empezar a aprender, consulta los [apuntes de desarrollo](apuntes/plan-aprendizaje-modding.md) y después abre el código de Tomatazo.
