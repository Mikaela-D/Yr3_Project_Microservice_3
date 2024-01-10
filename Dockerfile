FROM openjdk:17

WORKDIR /app

COPY target/Project_Microservice_3-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "Project_Microservice_3-0.0.1-SNAPSHOT.jar"]