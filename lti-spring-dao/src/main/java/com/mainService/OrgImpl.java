package com.mainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;
import com.service.BankAccountService;
import com.service.EmployeeService;
import com.service.InsuranceService;

@Service
public class OrgImpl implements JoinOrganization {
	@Autowired
	EmployeeService empService;
	
	@Autowired
	InsuranceService insService;
	
	@Autowired
	BankAccountService bankService;
	
	@Override
	public void joinOrg(Employee e, Insurance i, BankAccount b) {
		empService.addEmployee(e);
		insService.registerEmpInsurance(i);
		bankService.addBankAccount(b);
	}

	@Override
	public void leaveOrg(Employee e, Insurance i, BankAccount b) {
		empService.deleteEmployee(e.getEmpId());
		insService.deleteInsurance(i.getEmpId());
		bankService.deleteBankAccount(b.getEmpId());
	}
}
