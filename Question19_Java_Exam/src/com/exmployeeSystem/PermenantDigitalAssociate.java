package com.exmployeeSystem;

public class PermenantDigitalAssociate extends DigitalAssociate {
	private int technicalCertifications;
	private int yearsOfExperience;

	public PermenantDigitalAssociate(int employeeId, int yearsOfExperience, String employeeType, int technicalCertifications) {
		super(employeeId, employeeType);
		this.yearsOfExperience = yearsOfExperience;
		this.technicalCertifications = technicalCertifications;
	}
	
	@Override
	public int getSalary() {
		return 5000 * this.yearsOfExperience + 1000 * this.technicalCertifications;
	}
	
	@Override
	public int getMediclaimCoverage() {
		return this.getSalary() * 2;
	}
}
