package com.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * This is an User Defined Runtime Exception which throws an error of Not Found if any employee 
 * is not found in the map. 
 */

//It assigns the User Defined Exception class to throw 404 type of error.
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

	
}
