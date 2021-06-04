package com.mohsinkd786;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SpringFeignConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignConsumerApplication.class, args);
	}
}
