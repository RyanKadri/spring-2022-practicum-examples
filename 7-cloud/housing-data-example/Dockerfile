FROM maven:3.8.1-jdk-11

WORKDIR /app
COPY ./pom.xml /app
COPY src /app/src

RUN mvn package
COPY ./real-estate-data.csv /app

CMD java -jar target/data-0.0.1-SNAPSHOT.jar