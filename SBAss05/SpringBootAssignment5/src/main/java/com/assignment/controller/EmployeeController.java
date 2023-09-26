package com.assignment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Employee;
import com.assignment.service.EmployeeService;

/*
 * This is a Employee Controller which handles the RESTfUL Web Requests. It acts as a frontend
 * endpoint to the Application.
 */

//This will return the data in the form of JSON rather than returning a view.
@RestController
public class EmployeeController {

	//Auto injection
	@Autowired
	private EmployeeService service;
	
	//using this endpoint it receives all the employees list. It uses a GET method to retrieve data
	@GetMapping("/employees")
	public List<Employee> showAllEmployees(){
		return service.getAllEmployees();
	}
	
	//using this endpoint it receives a particular employee by it's Id. It uses GET method to retrieve data
	@GetMapping("/employee/{id}")
	public Employee showEmployeeById(@PathVariable(value = "id")int id) {
		return service.getEmployeeById(id);
	}
	
	//using this endpoint it creates a employee in the map. It uses POST method to send the data.
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.saveEmployee(emp);
	}
	
	//using this endpoint it updates the existing object in the map by it's Id. It uses PUT method to update the data.
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable(value = "id")int id) {
		return service.updateEmployee(emp, id);
	}
	
	//using this endpoint it deletes the existing employee by it's Id. It uses DELETE method to delete the data.
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id")int id){
		return service.deleteEmployee(id);
	}
}
