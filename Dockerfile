FROM openjdk:11
EXPOSE 8080
ADD target/springboot-automation.jar springboot-automation.jar
ENTRYPOINT ["java","-jar","/springboot-automation.jar"]