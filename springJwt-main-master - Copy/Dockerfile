FROM openjdk:17-jdk-alpine
#FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/springJwt-0.0.1-SNAPSHOT.jar cloudt.jar
ENTRYPOINT ["java","-jar","/cloudt.jar"]