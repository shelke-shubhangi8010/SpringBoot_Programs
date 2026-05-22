package com.example.patient_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientService {

	@GetMapping("/patient")
	
	public String getPatient()
	{
		return "Patient Name :Ramesh";
	}
	
	
	
}
