package com.service;

import java.util.List;

import com.model.BankAccount;

public interface BankAccountService {
	public void addBankAccount(BankAccount account);
	public List<BankAccount> loadBankAccounts();
	public int deleteBankAccount(int empId);
}
