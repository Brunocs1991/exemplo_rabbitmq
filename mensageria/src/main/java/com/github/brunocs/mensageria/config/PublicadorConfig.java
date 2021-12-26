package com.github.brunocs.mensageria.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PublicadorConfig {
    @Value("${fila.nome}")
    private String mensagem;

    @Bean
    public Queue queue(){
        return new Queue(mensagem, true);
    }
}
