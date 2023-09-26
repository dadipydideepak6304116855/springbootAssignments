package com.assignment.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/*
 * This is a Global Exception Handler which catches the exceptions and errors from the controller. 
 * 
 * @ControllerAdvice - This Annotation handles all the exceptions and errors thrown by the controllers.
 * @ExcpetionHandler -  This annotation handles a specific exception from the controller.
 * ResponseEntity - ResponseEntity returns an HTTP response with specific HTTP status code.
 * WebRequest - It is an Interface in Spring Web Module that provides access to request headers, request parameters.
 */

@ControllerAdvice
public class GlobalException {

	//this function handler handles the 404 type of exceptions.
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorDetails> EmployeeNotFoundExceptionHandler(EmployeeNotFoundException ex, WebRequest web){
		ErrorDetails ed = new ErrorDetails(new Date(), ex.getMessage(), web.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}
	
	//This function Handler handles the 500 type of Exception which is a Global Exception.
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> GlobalExceptionHandler(Exception ex, WebRequest web){
		ErrorDetails ed = new ErrorDetails(new Date(), ex.getMessage(), web.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
