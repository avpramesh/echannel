FROM eclipse-temurin:17-jdk-alpine
WORKDIR /
VOLUME /tmp
COPY target/*.jar echannel-verification-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","echannel-verification-0.0.1-SNAPSHOT.jar"]
EXPOSE $PORT