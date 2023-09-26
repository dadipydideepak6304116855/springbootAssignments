package com.assignment.model;

/*
 * This is a Employee Model Class which has 4 properties as id, name, email and location.
 * This Employee class acts as a Value in the Map with the key as Integer a.k.a employeeId. 
 */

public class Employee {

	//employee properties
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeeLocation;
	
	//default constructor
	public Employee() {
		super();
	}

	//parameterized constructor
	public Employee(int employeeId, String employeeName, String employeeEmail, String employeeLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeLocation = employeeLocation;
	}

	//respective getters and setters

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	//to String method for in case of debugging the model class
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeLocation=" + employeeLocation + "]";
	}
	
}
