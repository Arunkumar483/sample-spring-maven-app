FROM amazoncorretto:11-alpine-jdk

ENTRYPOINT [ "mvn", "package" ]

COPY ./target/anthosv2-maven-deployment-sample-*.jar /opt/anthosv2-maven-deployment-sample.jar

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java -jar /opt/anthosv2-maven-deployment-sample.jar" ]