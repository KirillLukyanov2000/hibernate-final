FROM openjdk:18

COPY ./target/hibernate-final-2.0.jar /hibernate-final-2.0.jar

CMD ["java", "-jar", "hibernate-final-2.0.jar"]