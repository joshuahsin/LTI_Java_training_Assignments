package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	@Override
	public void addEmployee(Employee e) {
		dao.addEmployee(e);
	}

	@Override
	public List<Employee> loadEmployee() {
		return dao.loadEmployees();
	}

	@Override
	public Employee searchEmployee(String name) {
		return dao.searchEmployee(name);
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}
}
