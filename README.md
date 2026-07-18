# Exemplo RabbitMQ com Spring Boot

Projeto de estudo sobre mensageria com RabbitMQ, Spring Boot e Docker.

## Objetivo

Praticar comunicação assíncrona entre componentes usando filas, reduzindo acoplamento direto entre produtor e consumidor de mensagens.

## Stack

- Java
- Spring Boot
- RabbitMQ
- Docker

## Arquitetura estudada

- RabbitMQ executado em container Docker.
- Aplicação backend integrada ao broker de mensagens.
- Separação entre envio e consumo de mensagens.
- Console de gerenciamento do RabbitMQ para acompanhamento das filas.

## Como executar o RabbitMQ

Executar no console e remover o container ao encerrar a sessão:

```bash
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```

Executar em background:

```bash
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```

Console de gerenciamento:

```text
http://localhost:15672
```

## Aprendizados principais

- Fundamentos de mensageria.
- Uso de filas para comunicação assíncrona.
- Desacoplamento entre produtor e consumidor.
- Execução de infraestrutura local com Docker.
- Observação de mensagens pelo painel do RabbitMQ.

## Referência de estudo

Tutorial RabbitMQ com Spring Boot: https://mmarcosab.medium.com/tutorial-rabbitmq-com-spring-boot-480e3a6682e6
