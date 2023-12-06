package com.rai.service;

import java.util.List;

import com.rai.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmoloyee(Employee employee, long id);
	void deletEmployee(long id);
}
