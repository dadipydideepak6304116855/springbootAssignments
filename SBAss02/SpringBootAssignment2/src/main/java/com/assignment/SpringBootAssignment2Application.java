package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Create a Spring Boot Application based on the below requirement:
 * 
 *  a. The application should support two RESTful URLs.
 *  b. The first RESTful URL should display a HTML page that displays the bank Name as it's Heading
 *     and also a table a with around 10 Branches of that bank in the city of Mumbai.
 *  c. The second RESTful URL should display a HTML page  that displays the bank Name as it's Heading
 *     and also a table with with all services provided by the bank.
 *  d. Test the application by testing both the URLs to verify that they return and display data as
 *     expected.
 */

@SpringBootApplication
public class SpringBootAssignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment2Application.class, args);
	}

}
