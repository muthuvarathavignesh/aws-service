FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/product-service-0.0.1-SNAPSHOT.jar product-service-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","product-service-0.0.1-SNAPSHOT.jar"]
