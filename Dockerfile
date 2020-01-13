FROM maven:3.5.2-jdk-8-alpine

MAINTAINER Daniel Rosales

WORKDIR /app

COPY ./target/spring-cloud-feign-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "spring-cloud-feign-0.0.1-SNAPSHOT.jar"]