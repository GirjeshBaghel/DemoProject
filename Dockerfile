
# Stage 1: Build Java application
FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Stage 2: Run Java application
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 5000

CMD ["java", "-jar", "app.jar"]
