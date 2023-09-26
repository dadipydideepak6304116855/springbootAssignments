package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Add an Additional facility to the previous Assignment-1 solution project, as per the below 
 * requirement: 
 * 
 *  a. A client would also be interested to know the health of this application so when the client
 *     uses the '/health' path parameter after the application URL, it shows the health of the 
 *     application (status of the application) as UP/DOWN.
 */

@SpringBootApplication
public class SpringBootAssignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment3Application.class, args);
	}

}
