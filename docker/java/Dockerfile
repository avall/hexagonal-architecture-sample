FROM adoptopenjdk/openjdk11-openj9:latest as builder
LABEL stage=builder
WORKDIR /workspace/app

COPY . .
ARG MAVEN_REPO_PASSWORD
RUN ./mvnw --settings settings.xml package

FROM adoptopenjdk:11-jre-openj9
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target
COPY --from=builder ${DEPENDENCY}/app.jar /app.jar
EXPOSE 8081

ENTRYPOINT ["java","-Xms256m","-Xmx512m","-jar","/app.jar"]
