package com.assignment7;

public class Student {
	private int studentId;
	private String studentName;
	private char studentType;
	private String residentialStatus;
	private double feesPerMonth;
	
	public Student(int id, char type, String firstName, String lastName) {
		studentId = id;
		studentType = type;
		studentName = firstName + " " + lastName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String firstName, String lastName) {
		studentName = firstName + " " + lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentType(char type) {
		this.studentType = type;
	}
	
	public char getStudentType() {
		return studentType;
	}
	
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}

	public static void main(String[] args) {
		Student student = new Student(1, 'F', "Joshua", "Hsin");

		student.setResidentialStatus("Hostelite");
		
		if(student.getResidentialStatus().equalsIgnoreCase("Day Scholar")) {
			student.calculateFees(5000);
		}
		else {
			student.calculateFees(5000, 500);
		}
		
		System.out.println(student.getFeesPerMonth());
	}
}
