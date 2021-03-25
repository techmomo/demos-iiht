package com.iiht.sample.resource;

import com.iiht.sample.entity.User;
import com.iiht.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(value = "/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "User Deleted Successfully";
    }
}
