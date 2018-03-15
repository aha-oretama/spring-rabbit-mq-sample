# spring-rabbit-mq-sample

This repository is sample for Spring Boot with [RabbitMQ](http://www.rabbitmq.com/).
This is made by referring [GETTING STARTED](https://spring.io/guides/gs/messaging-rabbitmq/).

# How to run

Precondition is to install [Docker](https://www.docker.com/).
You execute the following command. Then application is going to run.

```bash
$ docker-compose up -d
$ ./mvnw spring-boot:run
``` 

Application runs and executes `Runner`, then `Runner` sends the message and `Receiver` receives the message through RabbitMQ. 
