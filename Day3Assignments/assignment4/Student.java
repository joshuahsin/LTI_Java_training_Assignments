package com.assignment4;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	
	public Student() {
		studentId = 10;
		studentType = 'F';
	}
	
	public Student(int id, char type, String firstName, String lastName) {
		studentId = 10;
		studentType = 'F';
		studentName = firstName + " " + lastName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	public void setStudentName(String firstName, String lastName) {
		studentName = firstName + " " + lastName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(20, 'I', "Joshua", "Hsin");
		
		int id = 15;
		char type = 'L';
		String firstName = "John";
		String lastName = "Doe";
		
		student.setStudentId(id);
		student.setStudentType(type);
		student.setStudentName(firstName, lastName);
		
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());
	}
}
