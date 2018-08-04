FROM maven:3.5.0-jdk-8

WORKDIR /home/picpay/backend

COPY ./pom.xml pom.xml
COPY ./src src/

RUN mvn clean package
EXPOSE 8080

CMD ["java", "-jar", "target\picpay-0.0.1-SNAPSHOT.jar"]