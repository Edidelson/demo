FROM openjdk:21-slim
WORKDIR /app
COPY target/demo-demo.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]