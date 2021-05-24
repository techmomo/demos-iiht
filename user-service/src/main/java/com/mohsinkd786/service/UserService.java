package com.mohsinkd786.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;


    @Value("${external.api.employee-service.url}")
    private String url;

    public List<String> getAllEmployees(){
        List employees = restTemplate.getForObject(url.concat("/employees"),List.class);

        return employees;
    }
}
