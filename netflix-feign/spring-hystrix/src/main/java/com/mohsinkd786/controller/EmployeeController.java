package com.mohsinkd786.controller;

import com.mohsinkd786.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private ProducerService producerService;

    @Autowired
    public EmployeeController(ProducerService service){this.producerService = service;
    }

    @GetMapping
    public String getMessage(){
        return producerService.getMessage();
    }
}
