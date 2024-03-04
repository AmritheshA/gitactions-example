FROM openjdk:17
EXPOSE 8080
ADD target/sample-cicd-repository.jar sample-cicd-repository.jar
ENTRYPOINT["java","-jar","sample-cicd-repository.jar"]