package com.dao;

import java.util.List;

import com.model.BankAccount;

public interface BankAccountDao {
	public void addBankAccount(BankAccount account);
	public List<BankAccount> loadBankAccounts();
	public int deleteBankAccount(int empId);
}
