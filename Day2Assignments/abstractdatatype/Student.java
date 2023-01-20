package com.assignments.abstractdatatype;

public class Student {
	private int studentId;
	private char studentType;
	
	public Student() {
		studentId = 10;
		studentType = 'F';
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
	
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = student;
		
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());
	}
}
