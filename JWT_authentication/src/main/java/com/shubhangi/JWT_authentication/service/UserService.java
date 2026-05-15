package com.shubhangi.JWT_authentication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubhangi.JWT_authentication.entity.User;
import com.shubhangi.JWT_authentication.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // Register User
    public User saveUser(User user) {
        return repo.save(user);
    }

    // Login Check
    public User login(String username, String password) {

        User user = repo.findByUsername(username);

        if(user != null &&
                user.getPassword) {
                

                return user;
            }

            return null;
        }
    }

