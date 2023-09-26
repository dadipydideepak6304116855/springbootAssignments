package com.assignment;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/*
 * Create a Spring Boot Application based on the below requirement:
 * 
 * a. The application should support two RESTful URLs.
 * b. The first RESTful URL should display the bank Name as String.
 * c. The second RESTful URL should display the bank Address as a String.
 * d. We would be interested to see the list of all default beans that were created by
 * 	  Spring Boot automatically in the console.
 * e. Test the application by executing and viewing the console to see the list of beans 
 *    and also test both the URLs to verify that they return and display data as expected.
 */

@SpringBootApplication
public class SpringBootAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment1Application.class, args);
	}

	//It outputs the list of all the beans that were created by the Spring Boot Application 
	//in the console.
	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			String[] names = ctx.getBeanDefinitionNames();
			Arrays.sort(names);
			
			for(String name: names) {
				System.out.println(name);
			}
		};
	}
}
