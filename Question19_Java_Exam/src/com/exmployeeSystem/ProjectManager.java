package com.exmployeeSystem;

public class ProjectManager implements Employee {
	private int yearsOfExperience;
	private int employeeId;
	
	public ProjectManager(int employeeId, int yearsOfExperience) {
		super();
		this.employeeId = employeeId;
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 10000 * yearsOfExperience;
	}

	@Override
	public int getMediclaimCoverage() {
		// TODO Auto-generated method stub
		return getSalary();
	}

	@Override
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return employeeId;
	}

}
