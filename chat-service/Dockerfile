FROM amazoncorretto:11
VOLUME /tmp
COPY target/chat-service-1.0.jar ChatService.jar
ENTRYPOINT ["java", "-jar", "ChatService.jar"]