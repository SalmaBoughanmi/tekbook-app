# TekBook

Application Spring Boot minimale servant de support aux labs DevSecOps (TEK-UP, ING-5-SSIR).

## Points d entree

| Methode | Chemin | Description |
|---|---|---|
| GET | `/` | Message de service et version |
| GET | `/api/books` | Liste de livres en dur |
| GET | `/actuator/health` | Sonde de sante — repond `{"status":"UP"}` |

## Lancer sans Docker

    mvn spring-boot:run

## Construire le JAR

    mvn package -DskipTests
    java -jar target/tekbook-0.0.1-SNAPSHOT.jar

Le nom du JAR produit est `tekbook-0.0.1-SNAPSHOT.jar` : il correspond au `CMD` du Lab 3.
