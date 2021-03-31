package com.mohsinkd786;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//public class AmqpDemoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AmqpDemoApplication.class, args);
//	}
//
//	@Bean
//	public ApplicationRunner runner(RabbitTemplate template){
//		return args -> {
//			template.convertAndSend("demoQueue","Hello how are u Mr.Rabbit");
//		};
//	}
//
//}
