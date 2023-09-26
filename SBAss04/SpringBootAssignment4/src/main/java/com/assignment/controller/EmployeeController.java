package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.exception.EmployeeNotFoundException;
import com.assignment.model.Employee;
import com.assignment.service.EmployeeService;

/*
 * This is a Employee Controller which handles the RESTfUL Web Requests. It acts as a frontend
 * endpoint to the Application.
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	//auto injection
	@Autowired
	private EmployeeService service;
	
	//this endpoint shows a view with the list of all employees.
	@GetMapping("/displayAll")
	public ModelAndView showAllEmployees() {
		return service.getAllEmployees();
	}
	
	//this endpoint shows a view of the employee-form
	@GetMapping("/employeeform")
	public String addEmployeeForm() {
		return "employee-form";
	}
	
	//this endpoint shows a view with a particular employee detail with reference to it's id.
	@GetMapping("/display/{id}")
	public ModelAndView showEmployeeById(@PathVariable(value = "id")int id) throws EmployeeNotFoundException {
		return service.getEmployeeById(id);
	}

	//this endpoint adds the employee data to the database.
	@PostMapping("/add")
	public ModelAndView addEmployee(@ModelAttribute("name") String name, @ModelAttribute("email") String email, @ModelAttribute("location") String location) {
		Employee emp = new  Employee(name, email, location);
		return service.saveEmployee(emp);
	}
}
