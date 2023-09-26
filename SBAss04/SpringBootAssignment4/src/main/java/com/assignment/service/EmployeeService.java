package com.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.exception.EmployeeNotFoundException;
import com.assignment.model.Employee;
import com.assignment.repository.EmployeeRepository;

/*
 * This is a Employee Service Class which has the whole business logic  functionality 
 * of the application written here that can be reused by other components in the application. 
 */

@Service
public class EmployeeService {

	//auto injection
	@Autowired
	private EmployeeRepository repository;
	
	
	//returns a view with the list of all employees
	public ModelAndView getAllEmployees(){
		ModelAndView mv = new ModelAndView();
		List<Employee> emps = repository.findAll();
		mv.addObject("employees", emps);
		mv.setViewName("allemployee");
		return mv;
	}
	
	//returns a view with the particular employee data using it's Id.
	public ModelAndView getEmployeeById(int id) throws EmployeeNotFoundException{
		ModelAndView mv = new ModelAndView();
		Optional<Employee> e = repository.findById(id);
		if (e.isEmpty()) {
			throw new EmployeeNotFoundException("Employee Not Found with this ID: "+id);
		}
		mv.addObject("emp", e.get());
		mv.setViewName("employee");
		return mv;
	}
	
	//returns a success view page and stores the data in the database.
	public ModelAndView saveEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		repository.save(emp);
		mv.setViewName("success");
		return mv;
	}
	
}
