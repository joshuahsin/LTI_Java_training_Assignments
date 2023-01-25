package com.exmployeeSystem;

public class DigitalAssociate implements Employee{
	protected int yearsOfExperience;
	protected String employeeType;
	
	public DigitalAssociate(int yearsOfExperience, String employeeType) {
		super();
		this.yearsOfExperience = yearsOfExperience;
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

}
