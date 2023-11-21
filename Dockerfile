FROM maven:3.9.5-amazoncorretto-21-debian AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:20-jdk
COPY --from=build /target/backendapi-0.0.1-SNAPSHOT.jar go2climb.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","go2climb.jar"]