package com.example.appoinment_service.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class AppoinmentController {

//  API gateway      // web client       // port no
// RestTemplate restTemplate = new RestTemplate();   <---This  api gateway	            
	
	
/*
		@GetMapping("/appoinment")
		public String BookAppoinment()
		{
			
			//  API gateway // web client //  port no
			
			RestTemplate restTemplate = new RestTemplate();

			// call patient service

			String patient = restTemplate.getForObject("http://localhost:8081/patient", String.class);

			// call doctor service
			String doctor = restTemplate.getForObject("http://localhost:8082/doctor", String.class);

			return " Appoinment book Successfully \n" + patient + "\n" + doctor;
		}
*/
	
	// Alternate way
	
	@Autowired // reference App config 
	private RestTemplate restTemplate;
	
	@GetMapping("/appoinment")
	public String BookApp() 
	{
		// call patient service

					String patient = restTemplate.getForObject("http://localhost:8081/patient", String.class);

					// call doctor service
					String doctor = restTemplate.getForObject("http://localhost:8082/doctor", String.class);

					return " Appoinment book Successfully <br>" + patient + "<br>" + doctor;
				
	}
	
	}

	
	

