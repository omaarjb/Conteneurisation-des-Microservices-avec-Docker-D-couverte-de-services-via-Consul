FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./src ./src
COPY ./pom.xml .
RUN mvn -DskipTests clean package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /
COPY --from=builder /app/target/*.jar client-service.jar
ENTRYPOINT ["java","-jar","/client-service.jar"]
