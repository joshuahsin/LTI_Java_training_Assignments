package com.assignment9;

public class Student {
	private static int studentId = 550;
	private char studentType;
	private String studentName;
	
	public Student() {
		studentId++;
	}
	
	public Student(char sType, String fname, String lname) {
		this();
		studentName = fname + " " + lname;
		studentType = sType;
	}
	
	public static void displayDetails(Student student) {
		System.out.println("Student Id: " + student.studentId);
		System.out.println("Student Type: " + student.studentType);
		System.out.println("Student Name: " + student.studentName);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		displayDetails(studentTwo);
	}
}
