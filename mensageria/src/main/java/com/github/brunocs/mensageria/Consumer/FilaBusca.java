package com.github.brunocs.mensageria.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class FilaBusca {
    @RabbitListener(queues = {"${fila.nome}"})
    public void receber(@Payload String fileBody) {
        System.out.printf("Mensagem %s%n", fileBody);
    }
}
