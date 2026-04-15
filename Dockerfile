FROM eclipse-temurin:17
COPY target/auction-system-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]