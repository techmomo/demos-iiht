package com.mohsinkd786.controller;

import com.mohsinkd786.Employee;
import com.mohsinkd786.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    private ConsumerService service;

    @Autowired
    public ConsumerController(ConsumerService service){
        this.service = service;
    }

    @GetMapping
    public String getMessage(){
        return service.getMessageFromProducer();
    }

    @PostMapping("/save")
    public String saveEmployee(){
        return service.saveEmployee();
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return  service.findEmployees();
    }
}
