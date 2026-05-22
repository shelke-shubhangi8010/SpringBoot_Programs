package com.example.start.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.bean.Student;

@RestController
public class StudentController {

	
		@GetMapping ("/welcome")
		public String welcome()
		{
			return "My first Springboot application";
			
		}
		
	/*	@GetMapping ("/get")
		public Student get() 
		{
			Student s1=new Student(101,"Ram",88.30);
			return s1;
		}*/
		
		
		@GetMapping("/findAll")
		
		public List<Student> findAll()
		{
			List<Student> l1 = new ArrayList<Student>();
			
			l1.add(new Student(101,"ram",56.24));
			l1.add(new Student(101,"ram",56.24));
			l1.add(new Student(101,"ram",56.24));
			l1.add(new Student(101,"ram",56.24));
			
			return l1;
		}
	}
	
	
	

