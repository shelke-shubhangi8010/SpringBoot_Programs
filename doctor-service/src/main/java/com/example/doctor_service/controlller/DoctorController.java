package com.example.doctor_service.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	
	@GetMapping("/doctor")
	public String getDoctor() 
	{
		return "Doctor Name : Dr.Sharma";
	}
	
}
