FROM openjdk:21-jre-slim
WORKDIR /app
COPY target/your-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]