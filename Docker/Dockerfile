FROM openjdk:11.0-jdk-slim-stretch


RUN apt-get install -y tzdata

ENV TZ America/Bogota

COPY . /app

ENTRYPOINT [ "java", "-jar", "/app/pichincha-0.0.1-SNAPSHOT.jar" ]

