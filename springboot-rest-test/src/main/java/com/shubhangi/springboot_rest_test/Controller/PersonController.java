package com.shubhangi.springboot_rest_test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubhangi.springboot_rest_test.model.Person;
import com.shubhangi.springboot_rest_test.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {
	@Autowired
	private PersonService personService;

	@GetMapping

	public List<Person> getPerson() {
		return personService.getAllPerson();

	}
    @GetMapping("/{id}")
    
    public Person getSingalPerson(@PathVariable Long id)
    {
		
    	return personService.getPersonById(id);
    	
    }
    
    @PostMapping 
    public Person createPerson(@RequestBody Person person)
    {
    
    	return personService.createPerson(person);
    		
    }
    
    @PutMapping("/{id}")
    
    public Person updatePerson(@PathVariable Long id ,@RequestBody Person Person)
    {
    
    	return personService.createPerson(Person);
    		
    }
    
    @DeleteMapping("/{id}")
    
    public String deletePerson(@PathVariable Long id) {
    	return personService.deletePerson(id);
    	
    }
    
    
}
