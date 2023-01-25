package com.exmployeeSystem;

public class PermenantDigitalAssociate extends DigitalAssociate {
	private int technicalCertifications;

	public PermenantDigitalAssociate(int yearsOfExperience, String employeeType, int technicalCertifications) {
		super(yearsOfExperience, employeeType);
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
