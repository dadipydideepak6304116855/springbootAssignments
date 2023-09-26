package com.assignment.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * This is a Model class to show the Error in a proper format.It consists of 
 * 3 properties: timestamp, message and description.  
 */

public class ErrorDetails {

	// here used this @JsonProperty because it creates a entry in the JSON and outputs the errors in a proper JSON format.
	@JsonProperty
	Date timestamp;
	
	@JsonProperty
	String message;
	
	@JsonProperty
	String description;
	
	//parameterized constructor
	public ErrorDetails(Date timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	
	
}
