package com.mainService;

import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;

public interface JoinOrganization {
	public void joinOrg(Employee e, Insurance i, BankAccount b);
	public void leaveOrg(Employee e, Insurance i, BankAccount b);
}
