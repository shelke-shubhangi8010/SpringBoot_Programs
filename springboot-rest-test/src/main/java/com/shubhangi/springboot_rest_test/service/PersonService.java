package com.shubhangi.springboot_rest_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubhangi.springboot_rest_test.Repository.PersonRepository;
import com.shubhangi.springboot_rest_test.exception.PersonNotFoundException;
import com.shubhangi.springboot_rest_test.model.Person;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	public Person createPerson(Person person)
	{
		return personRepository.save(person);
		
	}
	
	public Person getPersonById(Long id)
	{
		//return personRepository.findById(id).orElse(null);
		return personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException("Person not found with mention"));
	}
	public List<Person> getAllPerson(){
		return personRepository.findAll();
		
	}
	
	public String deletePerson(Long id)
	{
	 personRepository.deleteById(id);
		return "Person deletee  successfully";
				
		
	}
	
	public Person updatePerson(Long id, Person person) {
		
		Person existingPerson = personRepository.findById(id).orElse(null);
		if(existingPerson!=null) 
		{
			existingPerson.setName(person.getName());
			existingPerson.setEmail(person.getEmail());
			return personRepository.save(existingPerson);
		}
		return existingPerson;
		
		
	}
	
}

