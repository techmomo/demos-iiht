package com.mohsinkd786;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "demo-iiht",groupId = "ctsGrp")
    public void onMessage(String message){
        System.out.println("Kafka Listener - START");
        System.out.println(message);
        System.out.println("Kafka Listener - END");
    }

//    @KafkaListener(topics = "demo-iiht",groupId = "ctsGrp")
//    public void onMessage1(String message){
//        System.out.println("Kafka Listener - START 1");
//        System.out.println(message);
//        System.out.println("Kafka Listener - END 1");
//    }
}
