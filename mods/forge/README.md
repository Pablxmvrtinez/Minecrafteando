# Mods para Forge 1.20.1

Notas de cuatro mods que preparamos para **Minecraft 1.20.1**, **Forge 47.4.10** y **Java 17**. Son proyectos distintos de [Tomatazo](../fabric/primer-mod/README.md), que usa Fabric.

| Mod | ID | JAR original | Versión interna |
| --- | --- | --- | --- |
| Gremlin de los Acertijos | `gremlin` | `gremlin-1.20.1-forge-1.2.1.jar` | 1.2.1 |
| Ruby + REFORCED | `reforced` | `ruby-reforced-1.20.1-forge-1.0.3.jar` | 1.0.2 |
| Mochilas + Hornos | `pockets` | `mochilas-hornos-1.20.1-forge-1.0.1.jar` | 1.0.0 |
| Mazmorras de Duendes | `duendes` | `mazmorras-duendes-1.20.1-forge-1.0.2.jar` | 1.0.0 |

Gremlin incluye una serie de acertijos y un combate si se fallan demasiados. REFORCED añade minerales y equipo, Mochilas + Hornos amplía el almacenamiento y las estaciones portátiles, y Mazmorras de Duendes incorpora estructuras y enemigos.

## Archivos

Los JAR se recuperaron de un ZIP de trabajo junto con recetas, capturas y notas. Los cuatro archivos pasaron una comprobación de integridad ZIP y se compararon con sus copias dentro del paquete. Sus huellas están en [SHA256.txt](SHA256.txt); la información de cada archivo también está en [manifest-archivo.json](manifest-archivo.json).

**Los binarios y el proyecto Java/Gradle completo no están alojados aquí.** Este directorio sirve para identificar las versiones recuperadas. Tampoco he repetido todavía las pruebas dentro de Minecraft.

Hay una diferencia entre el nombre y la versión declarada dentro de tres JAR: Ruby (1.0.3 frente a 1.0.2), Mochilas (1.0.1 frente a 1.0.0) y Mazmorras (1.0.2 frente a 1.0.0). He mantenido los nombres originales para poder reconocer los archivos.

## Instalación desde el archivo recuperado

1. Crea un perfil con Minecraft 1.20.1 y Forge 47.4.10.
2. Coloca los cuatro JAR en la carpeta `mods/` del perfil. No dejes copias antiguas de los mismos mods.
3. Si juegas en servidor, usa las mismas versiones en cliente y servidor.
4. Prueba primero en un mundo nuevo. Los minerales y las estructuras necesitan terreno sin generar.

Que un JAR no esté corrupto no significa que sea compatible con cualquier combinación de mods.
