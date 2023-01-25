package com.exmployeeSystem;

public class ProjectManager implements Employee {
	private int yearsOfExperience;
	
	public ProjectManager(int yearsOfExperience) {
		super();
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

}
