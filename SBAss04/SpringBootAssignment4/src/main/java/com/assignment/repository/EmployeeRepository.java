package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Employee;

/*
 * This is Employee Repository interface which interacts with the database using the JpaRepository interface.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
