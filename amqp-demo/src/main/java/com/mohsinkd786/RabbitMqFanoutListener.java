package com.mohsinkd786;

import com.mohsinkd786.config.RabbitMqConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqFanoutListener {

    @RabbitListener(queues = {RabbitMqConfiguration.FANOUT_QUEUE})
    public void fanoutlistener(String message){
        System.out.println("fanout listener");
        System.out.println(message);
        System.out.println("END ...");
    }

    @RabbitListener(queues = {RabbitMqConfiguration.FANOUT_QUEUE2})
    public void fanoutlistener2(String message){
        System.out.println("fanout listener 2");
        System.out.println(message);
        System.out.println("END ...");
    }
}
