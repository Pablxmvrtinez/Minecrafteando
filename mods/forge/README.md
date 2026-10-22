# Archivo de mods Forge 1.20.1 · SMAPT/Codex

Este directorio documenta los cuatro mods que desarrollamos para **Minecraft Java 1.20.1 / Forge 47.4.10 / Java 17**. Es independiente de [Tomatazo (Fabric)](../fabric/primer-mod/README.md).

## Mods recuperados

| Mod | ID | Archivo de distribución original | Versión declarada dentro del JAR |
|---|---|---|---|
| Gremlin de los Acertijos | `gremlin` | `gremlin-1.20.1-forge-1.2.1.jar` | `1.2.1` |
| Ruby + REFORCED | `reforced` | `ruby-reforced-1.20.1-forge-1.0.3.jar` | `1.0.2` |
| Mochilas + Hornos | `pockets` | `mochilas-hornos-1.20.1-forge-1.0.1.jar` | `1.0.0` |
| Mazmorras de Duendes | `duendes` | `mazmorras-duendes-1.20.1-forge-1.0.2.jar` | `1.0.0` |

- **Gremlin:** encuentros con ocho acertijos; un exceso de fallos lo transforma en un jefe con botín especial.
- **Ruby + REFORCED:** progresión con Ruby y variantes avanzadas de herramientas y armaduras.
- **Mochilas + Hornos:** almacenamiento mejorable, estaciones portátiles y hornos superiores.
- **Mazmorras de Duendes:** estructuras, enemigos especiales, jefes y equipo mejorable.

## Archivo original

Se recuperó el paquete `PACK-CODEX-1.20.1-FORGE.zip`, que contiene los cuatro JARs compilados, documentación de mecánicas/recetas y capturas. Se verificó que los cuatro JARs individuales **coinciden byte a byte** con los incluidos en el ZIP. Sus valores SHA-256 están en [SHA256.txt](SHA256.txt).

**Estado de publicación:** este directorio documenta el archivo recuperado. **Los JARs binarios y sus fuentes Gradle/Java completas todavía no están alojados en este repositorio**. No interpretar la documentación como enlace de descarga desde GitHub ni como una compilación nueva. El archivo de distribución recuperado se conserva por separado.

## Instalación de los binarios archivados

1. Prepara un perfil de Minecraft Java **1.20.1**, **Forge 47.4.10** y **Java 17**.
2. Extrae el paquete archivado y coloca los cuatro `.jar` de `mods/` en la carpeta `mods` del perfil.
3. Elimina las versiones antiguas o duplicadas de estos mismos mods.
4. Para partidas multijugador, usa los mismos JARs en el servidor y en los clientes.
5. Prueba antes en un mundo nuevo; los minerales y las mazmorras necesitan terreno por generar.

**Nota de versiones:** el archivo Ruby se llama 1.0.3 pero declara 1.0.2 internamente; Mochilas 1.0.1 declara 1.0.0; Mazmorras 1.0.2 declara 1.0.0. Son discrepancias históricas del empaquetado original. No se han cambiado las versiones de los binarios ni se afirma que hayan sido probados de nuevo en Minecraft.

## Integridad

Un JAR es un ZIP; todos pasaron la comprobación de integridad ZIP. Esto verifica que el archivo no está corrupto, **no** garantiza ausencia de errores ni compatibilidad con otros mods.
