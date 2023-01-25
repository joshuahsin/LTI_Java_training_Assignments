package com.exmployeeSystem;

public class EmployeeSystemClient {
	public static void main(String[] args) {
		EmployeeSystem system = new EmployeeSystem();
		
		system.addEmployee("Project Manager", 'p', 5);
		system.addEmployee("Digital Associate", 'c', 1);
		system.addEmployee("Digital Associate", 'p', 3);
	}
}
