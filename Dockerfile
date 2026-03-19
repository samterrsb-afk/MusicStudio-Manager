# Base image: Ubuntu 22.04
FROM ubuntu:22.04

# Instala Java y Git
RUN apt update && apt install -y openjdk-11-jdk git

# Crea un directorio de trabajo
WORKDIR /MusicStudio

# Copia el proyecto desde tu máquina
COPY . /MusicStudio

# Comando por defecto al iniciar el contenedor
CMD ["java", "src/Main.java"]
