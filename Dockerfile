FROM ubuntu:latest
LABEL authors="edidelson"

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

ENTRYPOINT ["top", "-b"]