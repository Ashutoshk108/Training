FROM openjdk:18-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY demo-docker-0.0.1-SNAPSHOT.jar demo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-docker-0.0.1-SNAPSHOT.jar"]