package com.springsecurity.demo.controller;

import com.springsecurity.demo.dto.Student;
import com.springsecurity.demo.entity.Users;
import com.springsecurity.demo.repo.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/welcome")
    public ResponseEntity welcomeAll(HttpServletRequest httpServletRequest) {
        String resp = "Welcome all!.. The session id is "+httpServletRequest.getSession().getId();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/user")
    public String welcomeUser() {
        return "Welcome User!";
    }

    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "Welcome Admin!";
    }

    @GetMapping("/users")
    public List<Users> getUsers() {

        return userRepo.findAll();
    }
}
