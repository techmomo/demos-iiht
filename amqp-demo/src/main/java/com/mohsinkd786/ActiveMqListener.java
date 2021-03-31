package com.mohsinkd786;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

@Component
public class ActiveMqListener {

    @JmsListener(destination = "myQueue" )
    public void listen(String message){
        System.out.println("Active MQ");
        System.out.println(message);
        System.out.println("Active MQ END");
    }

//    @JmsListener(destination = "demoQ")
//    public void subscriber(@Payload String payload, @Headers MessageHeaders headers, Message message, Session session){
//
//        System.out.println("Active MQ Subscriber");
//        System.out.println(payload);
//        System.out.println(message);
//        System.out.println("Active MQ  Subscriber END");
//    }
}
