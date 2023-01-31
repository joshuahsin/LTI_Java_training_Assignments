package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BankAccountDao;
import com.model.BankAccount;

@Service
public class BankServiceImpl implements BankAccountService {
	@Autowired
	BankAccountDao dao;
	
	@Override
	public void addBankAccount(BankAccount account) {
		dao.addBankAccount(account);
	}

	@Override
	public List<BankAccount> loadBankAccounts() {
		return dao.loadBankAccounts();
	}

	@Override
	public int deleteBankAccount(int empId) {
		return dao.deleteBankAccount(empId);
	}
	
}
