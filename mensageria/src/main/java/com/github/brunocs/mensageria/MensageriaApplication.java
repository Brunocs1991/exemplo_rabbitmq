package com.github.brunocs.mensageria;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class MensageriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MensageriaApplication.class, args);
    }

}
