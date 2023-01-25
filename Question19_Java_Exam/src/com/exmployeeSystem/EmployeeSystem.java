package com.exmployeeSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem {
	private ArrayList<Employee> empList;
	
	EmployeeSystem() {
		 empList = new ArrayList<Employee>();
	}
	
	public void addEmployee(String employeeTitle, char employeeType, int yearsOfExperience) {
		Employee e = null;
		if(employeeTitle.equals("Project Manager")) {
			e = new ProjectManager(yearsOfExperience);
		}
		else {
			if(employeeType == 'p') {
				Scanner s = new Scanner(System.in);
				System.out.print("Please enter number of technical certifications: ");
				int technicalCertifications = s.nextInt();
				e = new PermenantDigitalAssociate(yearsOfExperience, employeeTitle, technicalCertifications);
				s.close();
			}
			else {
				Scanner s = new Scanner(System.in);
				System.out.print("Please enter wage rate: ");
				int wageRate= s.nextInt();
				System.out.print("Please enter wage hours: ");
				int workHours = s.nextInt();
				e = new ContractDigitalAssociate(yearsOfExperience, employeeTitle, wageRate, workHours);
				s.close();
			}
		}
		empList.add(e);
	}
}
