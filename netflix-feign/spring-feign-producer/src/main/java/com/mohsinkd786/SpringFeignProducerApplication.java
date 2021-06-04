package com.mohsinkd786;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringFeignProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignProducerApplication.class, args);
	}

}
