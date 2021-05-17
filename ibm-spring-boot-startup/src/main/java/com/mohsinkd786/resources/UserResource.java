package com.mohsinkd786.resources;

import com.mohsinkd786.dtos.UserDto;
import com.mohsinkd786.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserResource {

    private UserService service;

    @Autowired
    public UserResource(UserService service){
        this.service = service;
    }

    @GetMapping
    public List<UserDto> getUserDtos(){
        return service.findAll();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto){
        return service.createUser(userDto);
    }
}
