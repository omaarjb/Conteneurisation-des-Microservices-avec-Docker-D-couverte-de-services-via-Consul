FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./pom.xml .
COPY ./src ./src
RUN mvn -DskipTests clean package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /
COPY --from=builder /app/target/*.jar gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]
