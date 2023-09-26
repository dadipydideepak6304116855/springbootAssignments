package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Create a Spring Boot Application as per the requirements below - 
 * 
 *  a. The application should display a form in the landing page (index.page) where
 *    the user can enter the 'Employee' details like 'EmployeeID', 'EmployeeName', 'EmployeeEmail',
 *    and 'EmployeeLocation' and upon submission the data should be saved onto a database table.
 *    
 *  b. The application should also support a '/displayAll' path which shows the list of all the 
 *    employees.
 *    
 *  c. The application should also support a '/display/<userid>' path where upon passing of 
 *	   as the parameter the details of only the particular employee holding that employeeID is displayed.
 * 
 * 	d. Code all the above functionalities required as a restful URL.
 */

@SpringBootApplication
public class SpringBootAssignment4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment4Application.class, args);
	}

}
