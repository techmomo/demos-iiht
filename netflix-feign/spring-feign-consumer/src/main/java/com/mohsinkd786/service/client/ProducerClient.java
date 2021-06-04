package com.mohsinkd786.service.client;

import com.mohsinkd786.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "spring-feign-producer")
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/producer")
    String getMessage();

    @RequestMapping(method = RequestMethod.GET,value = "/employee")
    List<Employee> getEmployees();

    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    String createEmployee(@RequestBody Employee employee);
}
