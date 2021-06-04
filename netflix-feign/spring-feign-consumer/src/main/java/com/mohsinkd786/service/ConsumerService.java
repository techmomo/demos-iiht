package com.mohsinkd786.service;

import com.mohsinkd786.Employee;
import com.mohsinkd786.service.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsumerService {

    private ProducerClient producerClient;

    @Autowired
    public void setProducerClient(ProducerClient producerClient) {
        this.producerClient = producerClient;
    }

    public String getMessageFromProducer(){
        return producerClient.getMessage();
    }

    public String saveEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Emp 1");

        return producerClient.createEmployee(employee);
    }

    public List<Employee> findEmployees(){
        return producerClient.getEmployees();
    }
}
