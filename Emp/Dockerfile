# Dockerfile
FROM openjdk:17
COPY target/Emp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar","--spring.profiles.active=docker"]