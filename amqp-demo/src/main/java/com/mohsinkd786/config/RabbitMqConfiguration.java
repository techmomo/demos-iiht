package com.mohsinkd786.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    private static final boolean DURABLE = false;
    public static final String FANOUT_QUEUE = "com.mohsinkd786.fanout.sample1";
    public static final String FANOUT_QUEUE2 = "com.mohsinkd786.fanout.sample2";

    public static final String TOPIC_QUEUE = "com.mohsinkd786.topic.sample1";
    public static final String TOPIC_QUEUE2 = "com.mohsinkd786.topic.sample2";

    public static final String TOPIC_EXCHANGE = "com.mohsinkd786.topic.sample1";
    public static final String BINDING_PATTERN = "*.hello.*";
    public static final String BINDING_PATTERN_ERROR = "*.error.*";
    public static final String FANOUT_EXCHANGE = "com.mohsinkd786.fanout.exchange";

    // Declare Queue
    @Bean
    public Queue demoQueue(){
        return new Queue("demoQueue",DURABLE);
    }

    TopicExchange topicExchange = new TopicExchange(TOPIC_EXCHANGE,DURABLE,false);

    @Bean
    public Declarables bindTopics(){
        Queue queue = new Queue(TOPIC_QUEUE,DURABLE);
        Queue errorQueue = new Queue(TOPIC_QUEUE2,DURABLE);

        Binding binding = BindingBuilder
                .bind(queue)
                .to(topicExchange)
                .with(BINDING_PATTERN);

        Binding errorBinding = BindingBuilder
                .bind(errorQueue)
                .to(topicExchange)
                .with(BINDING_PATTERN_ERROR);

        Declarables declarables = new Declarables(queue,errorQueue,topicExchange,binding ,errorBinding);

        return declarables;
    }

    @Bean
    public Declarables bindFanouts(){
        Queue queue = new Queue(FANOUT_QUEUE,DURABLE);
        Queue errorQueue = new Queue(FANOUT_QUEUE2,DURABLE);

        FanoutExchange fanoutExchange = new FanoutExchange(FANOUT_EXCHANGE,DURABLE,false);
        return new Declarables(queue,errorQueue,fanoutExchange,
                BindingBuilder.bind(queue).to(fanoutExchange),
                BindingBuilder.bind(errorQueue).to(fanoutExchange));
    }
}
