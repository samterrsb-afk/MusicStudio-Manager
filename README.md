# 🎸 MusicStudio Manager

¡Bienvenido a **MusicStudio Manager**! Este es un proyecto de gestión de activos musicales desarrollado íntegramente en **Java**, diseñado para demostrar habilidades sólidas en Programación Orientada a Objetos y despliegue profesional.

## 🚀 ¿Qué hace este proyecto?
Este software permite a un estudio de música gestionar su inventario y sus listas de reproducción de forma eficiente:
- **Gestión de Instrumentos:** Modelado de instrumentos con comportamientos específicos.
- **Sistema de Playlists:** Creación y gestión de listas de canciones con cálculo automático de duración.
- **Filtros Inteligentes:** Motores de decisión para filtrar música por duración (ideal para radio) o por artista específico.

## 🛠️ Stack Tecnológico
Para este proyecto he utilizado herramientas de estándar industrial:
* **Lenguaje:** Java 11 (POO, Colecciones, Lógica Algorítmica).
* **Virtualización:** [Docker](https://www.docker.com/) (Entorno de ejecución aislado y portátil).
* **Control de Versiones:** Git (Flujo de trabajo basado en ramas y commits descriptivos).

## 📦 Cómo ejecutarlo (Docker)
No necesitas instalar Java en tu máquina, solo ten Docker listo y lanza estos comandos en tu terminal:

1. **Construir la imagen:**
   ```bash
   docker build -t musicstudio-manager .
