package com.mohsinkd786.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProducerService {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "fallbackMessage" )
    public String getMessage(){
        String message = restTemplate.getForObject("http://localhost:8081/producer",String.class);
        return message;
    }

    private String fallbackMessage(){
        return "This is a fallback message";
    }
}
