package com.mohsinkd786.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping
    public String healthCheck() {
        return "Feign Producer is working fine ";
    }
}
