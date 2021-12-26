package com.github.brunocs.mensageria.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class MensageriaController {
    private final AmqpTemplate queueSender;
    public MensageriaController(AmqpTemplate queueSender){
        this.queueSender = queueSender;
    }

    @GetMapping
    public String send(){

        String mensagem = "test message";

        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("ultima", "sim");
        Message message = new Message(mensagem.getBytes(), messageProperties);

        queueSender.convertAndSend("teste-exchange", "routing-key-teste", message);
        return "ok. done";
    }
}
