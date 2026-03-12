FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/cart-service-0.0.1-SNAPSHOT.jar cart-service-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","cart-service-0.0.1-SNAPSHOT.jar"]
