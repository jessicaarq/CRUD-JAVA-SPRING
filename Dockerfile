FROM java:8
FROM maven:alpine

# image layer
WORKDIR /app
ADD pom.xml /app
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
