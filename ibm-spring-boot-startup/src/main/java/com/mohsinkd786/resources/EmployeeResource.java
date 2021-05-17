package com.mohsinkd786.resources;

import com.mohsinkd786.dtos.EmployeeDto;
import com.mohsinkd786.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/emps")
@RestController
public class EmployeeResource {

    private EmployeeService service;

    @Autowired
    public EmployeeResource(EmployeeService service){
        this.service = service;
    }

    @GetMapping
    public List<EmployeeDto> getEmployees(){
        return service.getEmployees();
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
        return service.createEmployee(employeeDto);
    }
}
