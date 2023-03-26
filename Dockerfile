FROM openjdk:19
ADD /target/yanre-0.0.1-SNAPSHOT.jar main.jar
ENTRYPOINT ["java", "-jar", "main.jar"]