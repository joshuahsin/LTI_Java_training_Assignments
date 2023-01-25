package com.exmployeeSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem {
	private ArrayList<Employee> empList;
	
	EmployeeSystem() {
		 empList = new ArrayList<Employee>();
	}
	
	public Employee findEmployee(int employeeId) {
		for(Employee e: empList) {
			if(e.getEmployeeId() == employeeId) {
				return e;
			}
		}
		return null;
	}
	
	public void addEmployee(int employeeId, String employeeTitle, char employeeType) {
		Employee e = null;
		Scanner s = new Scanner(System.in);
		if(employeeTitle.equals("Project Manager")) {
			System.out.println("Please enter years of experience for Project Manager: ");
			int yearsOfExperience = s.nextInt();
			e = new ProjectManager(employeeId, yearsOfExperience);
		}
		else {
			if(employeeType == 'p') {
				System.out.println("Please enter years of experience for permenant Digital Associate: ");
				int yearsOfExperience = s.nextInt();
				System.out.print("Please enter number of technical certifications for permenant Digital Associate: ");
				int technicalCertifications = s.nextInt();
				e = new PermenantDigitalAssociate(employeeId, yearsOfExperience, employeeTitle, technicalCertifications);
				//s.close();
			}
			else {;
				System.out.print("Please enter wage rate for contract Digital Associate: ");
				int wageRate= s.nextInt();
				System.out.print("Please enter wage hours for contract Digital Associate: ");
				int workHours = s.nextInt();
				e = new ContractDigitalAssociate(employeeId, employeeTitle, wageRate, workHours);
				//s.close();
			}
		}
		empList.add(e);
	}
}
