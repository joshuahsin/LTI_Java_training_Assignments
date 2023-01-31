package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee e);
	public List<Employee> loadEmployees();
	public Employee searchEmployee(String name);
	public int deleteEmployee(int id);
	//public void updateEmployee(int id, Employee emp);
}
