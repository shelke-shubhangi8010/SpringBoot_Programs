 package com.shubhangi.springboot_rest_test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubhangi.springboot_rest_test.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	
	
}
