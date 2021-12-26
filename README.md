# exemplo_rabbitmq

## rodar no console e ao fechar encerrar sessão
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management 
## rodar direto sem dependencias do console
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management

## link origem
https://mmarcosab.medium.com/tutorial-rabbitmq-com-spring-boot-480e3a6682e6
