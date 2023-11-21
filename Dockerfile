FROM maven:3.1.4-openjdk-20 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:20-jdk
COPY --from=build /target/backendapi-0.0.1-SNAPSHOT.jar go2climb.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","go2climb.jar"]