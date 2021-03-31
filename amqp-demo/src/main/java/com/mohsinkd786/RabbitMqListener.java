package com.mohsinkd786;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    @RabbitListener(queues = "demoQueue")
    public void listen(String message){
        System.out.println("Rabbit Listener ");
        System.out.println(message);
        System.out.println("END.....");
    }
}
