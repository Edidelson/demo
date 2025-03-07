FROM openjdk:21-slim
WORKDIR /app
COPY /home/runner/work/demo/demo/target/demo-demo.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]