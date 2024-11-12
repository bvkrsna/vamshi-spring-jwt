package com.springsecurity.demo.controller;

import com.springsecurity.demo.entity.Users;
import com.springsecurity.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {

        return usersService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println("Success");
        return usersService.verify(user);
    }
}
