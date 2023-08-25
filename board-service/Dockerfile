FROM amazoncorretto:11
VOLUME /tmp
COPY target/board-service-1.0.jar BoardService.jar
ENTRYPOINT ["java", "-jar", "BoardService.jar"]