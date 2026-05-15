package com.shubhangi.springboot_rest_test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandller extends Throwable {

	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFound(PersonNotFoundException ex)
	{
		return new ResponseEntity<> (ex.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handlerGlobalException(PersonNotFoundException ex)
	{
		return new ResponseEntity<> (ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
}
