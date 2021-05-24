package com.mohsinkd786.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

    @GetMapping
    public List<String> getEmployees(){
        return Arrays.asList("Bob","John","Tom");
    }
}

