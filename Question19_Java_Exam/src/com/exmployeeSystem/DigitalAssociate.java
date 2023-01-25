package com.exmployeeSystem;

public class DigitalAssociate implements Employee{
	protected String employeeType;
	protected int employeeId;
	
	public DigitalAssociate(int employeeId, String employeeType) {
		super();
		this.employeeId = employeeId;
		this.employeeType = employeeType;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMediclaimCoverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return this.employeeId;
	}

}
