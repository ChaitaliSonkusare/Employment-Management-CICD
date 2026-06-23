# Employee Management CI/CD Pipeline 🚀

 Implemented CI/CD automation for a Spring Boot Employee Management application using Jenkins, Maven, Docker and GitHub.
---

## Tech Stack

## Application

- Java 17/21
- Spring Boot
- Maven


## DevOps Tools

- Git & GitHub
- Jenkins
- Docker
- Linux (Ubuntu)


---

## Jenkins Pipeline Stages

The Jenkins declarative pipeline performs the following stages:

## 1. Code Checkout

Jenkins pulls the latest source code from GitHub.



---

## 2. Build Application

Maven builds the Spring Boot application.

Command:

mvn clean package


## 3. Run Test

mvn test

## 4. Build Docker Image


docker build -t employee-app .

## 5. Stop Old Container

docker stop employee-container

docker rm employee-container

## 6. Deploy Container

docker run -d \
--name employee-container \
-p 8080:8080 \
employee-app

## Jenkinsfile

Pipeline includes:

- Git checkout
- Maven build
- Automated testing
- Docker image creation
- Container deployment

## Prerequisites:

Install:

- Java
- Maven
- Jenkins
- Docker
- Git

## Jenkins Configuration

Required Jenkins plugins:

- Git Plugin
- Pipeline Plugin
- Docker Pipeline Plugin
- Maven Integration Plugin

## Learning Outcomes

Through this project:

- Created Jenkins Declarative Pipeline
- Integrated GitHub with Jenkins
- Automated Maven build process
- Created Docker images
- Deployed Spring Boot application using Docker
- Implemented CI/CD workflow











