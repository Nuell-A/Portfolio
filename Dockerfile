FROM openjdk:21-slim
LABEL maintainer ="nuell-a"
ADD PortfolioApplication/target/PortfolioApplication-0.0.1-SNAPSHOT.jar PortfolioApplication-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","PortfolioApplication-0.0.1-SNAPSHOT.jar"]