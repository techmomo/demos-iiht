package com.mohsinkd786.controller;

import com.mohsinkd786.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee){
        employees.add(employee);
        return "Employee was saved succesfully";
    }
}
