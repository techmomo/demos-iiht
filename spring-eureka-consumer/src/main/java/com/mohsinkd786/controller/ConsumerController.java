package com.mohsinkd786.controller;

import com.mohsinkd786.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ProducerClient producerClient;

    @GetMapping
    public String getMessage(){
        return  producerClient.getMessage();
    }
}
