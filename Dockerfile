FROM openjdk:16-alpine3.13
COPY build/libs/springJwtListener-1.0.jar springJwtListenerApp.jar
ENTRYPOINT ["java","-jar","springJwtListenerApp.jar"]
