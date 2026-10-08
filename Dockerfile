# ETAGE 1 — construire
# ETAGE 1 — construire
FROM maven:3.9-eclipse-temurin-21 AS builder

WORKDIR /build

COPY . .

RUN mvn package -DskipTests -B
# ETAGE 2 — executer
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /build/target/*.jar app.jar

EXPOSE 8080

RUN addgroup -S app && adduser -S -G app app
USER app

HEALTHCHECK --interval=30s --timeout=3s \
 CMD wget -qO- http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]
