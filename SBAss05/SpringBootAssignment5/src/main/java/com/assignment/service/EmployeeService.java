package com.assignment.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment.exception.EmployeeNotFoundException;
import com.assignment.model.Employee;

/*
 * This is a Employee Service Class which has the whole business logic  functionality 
 * of the application written here that can be reused by other components in the application. 
 */

@Service
public class EmployeeService {
	
	//Creating a Map with a key as Integer and value as the Employee class.
	private Map<Integer, Employee> employees;

	//default constructor to implicitly invoke the hashmap object.
	public EmployeeService() {
		employees = new HashMap<Integer, Employee>();
	}
	
	//List all the employees from the map 
	public List<Employee> getAllEmployees(){
		//converting the map values into a list to print the output as a list.
		List<Employee> emps = new ArrayList<>(employees.values());
		
		//if the list is empty it will throw an User Defined Runtime Exception.
		if (emps.isEmpty()) {
			throw new EmployeeNotFoundException("No Employee Found");
		}
		return emps;
	}
	
	//getting a single employee data by it's Id
	public Employee getEmployeeById(int id) {
		//Retrieving the employee data or object from the map.
		Employee emp = employees.get(id);
		
		//if the object is null it will throw an User Defined Runtime Exception.
		if (emp == null) {
			throw new EmployeeNotFoundException("Employee Not Found with this Id: "+id);
		}
		return emp;
	}
	
	//Particular Employee data is been saved inside the map. 
	public Employee saveEmployee(Employee emp){
		employees.put(emp.getEmployeeId(), emp);
		return emp;
	}
	
	//Employee Data is been updated here with the reference of the existing user Id.
	public Employee updateEmployee(Employee emp, int id) {
		//Retrieving employee data in the object from the map.
		Employee e = employees.get(id);
		
		//if the object is null it will throw an User Defined Runtime Exception. 
		if (e == null) {
			throw new EmployeeNotFoundException("Employee Not Found with this Id: "+id);
		}
		
		//updating the employee data in the object
		e.setEmployeeId(id);
		e.setEmployeeName(emp.getEmployeeName());
		e.setEmployeeEmail(emp.getEmployeeEmail());
		e.setEmployeeLocation(emp.getEmployeeLocation());
		
		//saving the data in the map.
		employees.put(id, e);
		return emp;
	}
	
	//Deleting the employee from the map with the reference of it's Id.
	public Map<String, Boolean> deleteEmployee(int id){
		Map<String, Boolean> res = new HashMap<>();
		
		//Retrieving the employee data or object from the map.
		Employee emp = employees.get(id);
		
		//if the object is null it will throw an User Defined Runtime Exception.
		if (emp == null) {
			throw new EmployeeNotFoundException("Employee Not Found with this Id: "+id);
		}
		
		//deleting the employee from the map.
		employees.remove(id);
		
		//return the response in the map form as "Message Deleted: TRUE".
		res.put("Employee Deleted", Boolean.TRUE);
		return res;
		
	}
}
