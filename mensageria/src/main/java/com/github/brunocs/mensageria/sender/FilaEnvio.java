package com.github.brunocs.mensageria.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FilaEnvio {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void envio(String ordem){
        rabbitTemplate.convertAndSend(this.queue.getName(), ordem);
    }
}
