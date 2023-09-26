package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Create a Spring Boot Application as per the requirement below -
 * 
 * a. The application should store in a 'Map' the employee details like 'EmployeeId', 
 * 'EmployeeName', 'EmployeeEmail', 'EmployeeLocation'.
 * 
 * b. The application should support all 4 Operations of REST like:
 * 		i. 	GET - using this method the client should be able to get details of all registered employees
 * 				  and also be able to get employee details based on Employee Id which can be passed
 * 				  as a path parameter.
 * 		ii. POST - using this method the client should be able to save an Employee Details into the Map.
 * 		iii. PUT - using this method the client should be able to update/modify the employee details except for employeeId 
 * 		iv. DELETE - using this method the client should be able to delete an unwanted employee record.
 * 
 * c. Test all the above functionalities using Chrome Plug-ins/apps like Advanced REST Client(ARC) or Postman. Take Screenshots of the 
 *    tests and submit with the solution.
 */

@SpringBootApplication
public class SpringBootAssignment5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment5Application.class, args);
	}

}
