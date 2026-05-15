package com.shubhangi.springboot_rest_test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="personInfo")

//@Setter // lombok dependency
//@Getter
@Data
@NoArgsConstructor // default constructor
@AllArgsConstructor   // parametrize constructor

public class Person {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private Long id;
private String  name;
private String  email;


public Person() {
	
}

public Person(Long id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}







}
