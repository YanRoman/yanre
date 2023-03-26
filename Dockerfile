FROM openjdk:19-jdk-alpine
ADD /target/yanre-0.0.1-SNAPSHOT.jar main.jar
ENTRYPOINT ["java", "-jar", "main.jar"]