package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee e);
	public List<Employee> loadEmployee();
	public Employee searchEmployee(String name);
	public int deleteEmployee(int id);
}
