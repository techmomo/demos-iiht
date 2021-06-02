package com.mohsinkd786.controller;

import com.mohsinkd786.vo.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    private List<Customer> customers= new ArrayList<>();

    public CustomerController(){
        customers.add(new Customer(1,"Customer 1"));
        customers.add(new Customer(2,"Customer 2"));
    }

    @GetMapping
    public List<Customer> findCustomers(){
        return customers;
    }

}
