FROM openjdk:8
ADD target/bulk-data-api.jar bulk-data-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","bulk-data-api.jar"]