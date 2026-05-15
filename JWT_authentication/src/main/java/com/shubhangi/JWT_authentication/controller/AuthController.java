package com.shubhangi.JWT_authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shubhangi.JWT_authentication.entity.User;
import com.shubhangi.JWT_authentication.service.UserService;
import com.shubhangi.JWT_authentication.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    // Register API
    @PostMapping("/register")
    public User register(@RequestBody User user) {

        return service.saveUser(user);
    }

    // Login API
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User validUser = service.login(
                user.getUsername(),
                user.getPassword());

        if(validUser != null) {

            String token =
                    JwtUtil.generateToken(validUser.getUsername());

            return token;
        }

        return "Invalid Username or Password";
    }
}