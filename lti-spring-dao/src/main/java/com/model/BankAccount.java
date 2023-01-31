package com.model;

public class BankAccount {
	private int empId;
	private int accountNumber;
	private int initialBalance;
	private String accountType;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(int empId, int accountNumber, int initialBalance, String accountType) {
		super();
		this.empId = empId;
		this.accountNumber = accountNumber;
		this.initialBalance = initialBalance;
		this.accountType = accountType;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [empId=" + empId + ", accountNumber=" + accountNumber + ", initialBalance=" + initialBalance
				+ ", accountType=" + accountType + "]";
	}
}
