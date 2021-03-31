package com.mohsinkd786;

import com.mohsinkd786.config.RabbitMqConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class FanoutAmqpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanoutAmqpDemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner amqpRunner(RabbitTemplate template){
        String payload = "Broadcast this message";
        return args -> {
            //template.convertAndSend("demoQueue","Hello how are u Mr.Rabbit");
            template.convertAndSend(RabbitMqConfiguration.FANOUT_EXCHANGE,"","fanout"+payload);

            template.convertAndSend(RabbitMqConfiguration.TOPIC_EXCHANGE,"user.hello.msg","topic hello msg"+payload);
            template.convertAndSend(RabbitMqConfiguration.TOPIC_EXCHANGE,"user.error.msg","topic hello error"+payload);
        };
    }

    @Bean
    public ApplicationRunner jmsRunner(JmsTemplate jmsTemplate){
        String payload = "Hello world ";
        return args->{
            jmsTemplate.convertAndSend("myQueue",payload);
        };
    }

//    @Bean
//    public ApplicationRunner activemqRunner(JmsTemplate jmsTemplate){
//        String payload = "Pub sub Message ";
//        return args->{
//            jmsTemplate.convertAndSend("demoQ",payload);
//        };
//    }
}
