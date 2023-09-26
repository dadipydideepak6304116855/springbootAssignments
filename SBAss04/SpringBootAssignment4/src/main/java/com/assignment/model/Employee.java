package com.assignment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/*
 * This is a Employee Model class which has 4 properties id, name, email and location.
 */

@Entity
//this sequence generator will auto increment with the initial values as 2001
@SequenceGenerator(name = "emp_seq", initialValue = 2001)
public class Employee {

	//employee properties
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Column(name = "id")
	private int employeeId;
	
	@Column(name = "name")
	private String employeeName;
	
	@Column(name = "email")
	private String employeeEmail;
	
	@Column(name = "location")
	private String employeeLocation;
	
	//default constructor
	public Employee() {
		super();
	}
	
	//parameterized constructor
	public Employee( String employeeName, String employeeEmail, String employeeLocation) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeLocation = employeeLocation;
	}

	//respective getter and setters
	
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

	//toString method for in case of debugging the model class
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeLocation=" + employeeLocation + "]";
	}
}
