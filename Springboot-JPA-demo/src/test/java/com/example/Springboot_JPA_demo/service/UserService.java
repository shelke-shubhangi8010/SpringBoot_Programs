package com.example.Springboot_JPA_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Springboot_JPA_demo.entity.User;
import com.example.Springboot_JPA_demo.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) 
	{
		this.userRepository = userRepository;
		
		
	} 
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	
	public List<User> getUser(){
		
		return userRepository.findAll();
	}
	
	
	
}
