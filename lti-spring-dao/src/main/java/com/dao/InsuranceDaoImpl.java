package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Insurance;

@Repository
public class InsuranceDaoImpl extends JdbcDaoSupport implements InsuranceDao {
	@Autowired
	DataSource ds;

	@PostConstruct
	public void init() {
		setDataSource(ds);
	}
	
	@Override
	public void registerEmpInsurance(Insurance insurance) {
		String insertStatement = "insert into insurance values(?, ?, ?)";
		getJdbcTemplate().update(insertStatement, new Object[] {insurance.getEmpId(), insurance.getSchemeName(), insurance.getCoverageAmount()});
	}

	@Override
	public int deleteInsurance(int empId) {
		String deleteStatement = "delete from insurance where empid = ?";
		return getJdbcTemplate().update(deleteStatement, empId);
	}
}
