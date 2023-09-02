FROM amazoncorretto:11
VOLUME /tmp
COPY target/imgfile-service-1.0.jar ImgfileService.jar
ENTRYPOINT ["java", "-jar", "ImgfileService.jar"]