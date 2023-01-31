package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.BankAccount;

@Repository
public class BankAccountDaoImpl extends JdbcDaoSupport implements BankAccountDao {
	@Autowired
	DataSource ds;

	@PostConstruct
	public void init() {
		setDataSource(ds);
	}
	
	@Override
	public void addBankAccount(BankAccount account) {
		String insertStatement = "insert into bank_account values(?, ?, ?, ?)";
		getJdbcTemplate().update(insertStatement, new Object[] {account.getEmpId(), 
				account.getAccountNumber(), account.getInitialBalance(), account.getAccountType()});
	}

	@Override
	public List<BankAccount> loadBankAccounts() {
		String loadStatement = "select * from bank_account";
		List<Map<String, Object>> lst = getJdbcTemplate().queryForList(loadStatement);
		List<BankAccount> result = new ArrayList<BankAccount>();
		
		for(Map<String, Object> bank : lst) {
			BankAccount account = new BankAccount((Integer)bank.get("empid"), (Integer)bank.get("accountNumber"), (Integer)bank.get("initialBalance"), (String)bank.get("accountType"));
			result.add(account);
		}
		return result;
	}

	@Override
	public int deleteBankAccount(int empId) {
		String deleteStatement = "delete from bank_account where empid = ?";
		return getJdbcTemplate().update(deleteStatement, empId);
	}

}
