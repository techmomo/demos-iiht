package com.mohsinkd786.services;

import com.mohsinkd786.dtos.EmployeeDto;
import com.mohsinkd786.mapper.EmployeeMapper;
import com.mohsinkd786.repositories.mongo.Employee;
import com.mohsinkd786.repositories.mongo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    private EmployeeMapper mapper;

    @Autowired
    public EmployeeService(EmployeeRepository repository,EmployeeMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<EmployeeDto> getEmployees(){
        return repository.findAll()
                .stream()
                .map(employee -> mapper.map(employee,EmployeeDto.class) )
                .collect(Collectors.toList());
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee entity = mapper.map(employeeDto,Employee.class);
        Employee savedEntity = repository.save(entity);
        return mapper.map(savedEntity,EmployeeDto.class);
    }
}
