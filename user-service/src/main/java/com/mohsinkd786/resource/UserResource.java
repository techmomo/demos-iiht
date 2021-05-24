package com.mohsinkd786.resource;

import com.mohsinkd786.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    private UserService userService;

    @Autowired
    public UserResource(UserService service){
        this.userService = service;
    }

    @GetMapping
    public List<String> getAllEmployees(){
        return userService.getAllEmployees();
    }
}
