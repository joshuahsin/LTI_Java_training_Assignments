package com.exmployeeSystem;

public class EmployeeSystemClient {
	public static void main(String[] args) {
		EmployeeSystem system = new EmployeeSystem();
		
		system.addEmployee(1, "Project Manager", 'p');
		System.out.println();
		system.addEmployee(2, "Digital Associate", 'c');
		System.out.println();
		system.addEmployee(3, "Digital Associate", 'p');
		System.out.println();
		
		System.out.println("Project Manager salary: " + system.findEmployee(1).getSalary());
		System.out.println("Digital Associate salary(contract): " + system.findEmployee(2).getSalary());
		System.out.println("Digital Associate salary(permenant): " + system.findEmployee(3).getSalary());
		
		System.out.println();
		
		System.out.println("Project Manager Mediclaim Coverage: " + system.findEmployee(1).getMediclaimCoverage());
		System.out.println("Digital Associate Mediclaim Coverage(contract): " + system.findEmployee(2).getMediclaimCoverage());
		System.out.println("Digital Associate Mediclaim Coverage(permenant): " + system.findEmployee(3).getMediclaimCoverage());
	}
}
