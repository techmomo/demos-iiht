package com.mohsinkd786;

import com.mohsinkd786.config.RabbitMqConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
//public class RabbitMqTopicListener {
//
//    @RabbitListener(queues = {RabbitMqConfiguration.TOPIC_QUEUE})
//    public void fanoutlistener(String message){
//        System.out.println("Topic listener");
//        System.out.println(message);
//        System.out.println("END ...");
//    }
//
//    @RabbitListener(queues = {RabbitMqConfiguration.TOPIC_QUEUE2})
//    public void fanoutlistener2(String message){
//        System.out.println("Topic listener 2");
//        System.out.println(message);
//        System.out.println("END ...");
//    }
//}
