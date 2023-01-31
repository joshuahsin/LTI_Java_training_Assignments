package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;


@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	@Autowired
	DataSource ds;

	@PostConstruct
	public void init() {
		setDataSource(ds);
	}
	
	@Override
	public void addEmployee(Employee e) {
		String insertStatement = "insert into employee values(?, ?, ?)";
		getJdbcTemplate().update(insertStatement, new Object[] {e.getEmpId(), e.getEmpName(), e.getCity()});
	}

	@Override
	public List<Employee> loadEmployees() {
		String loadStatement = "select * from employee";
		List<Map<String, Object>> lst = getJdbcTemplate().queryForList(loadStatement);
		List<Employee> result = new ArrayList<Employee>();
		
		for(Map<String, Object> emp : lst) {
			Employee e = new Employee((Integer)emp.get("empid"), (String)emp.get("empname"), (String)emp.get("city"));
			result.add(e);
		}
		
		return result;
	}

	@Override
	public Employee searchEmployee(String empname) {
		String searchStatement = "select * from employee where empname = ?";
		/*return (Employee) getJdbcTemplate().queryForObject(searchStatement, new Object[] {name}, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee(rs.getInt("empid"), rs.getString("empname"), rs.getString("city"));
				return e;
			}
		});*/
		return (Employee) getJdbcTemplate().queryForObject(searchStatement, new BeanPropertyRowMapper<Employee>(Employee.class), empname);
		//when using BeanPropertyRowMapper - Employee class name must match database column names
	}

	@Override
	public int deleteEmployee(int id) {
		String deleteStatement = "delete from employee where empid = ?";
		return getJdbcTemplate().update(deleteStatement, id);
	}
	
}
