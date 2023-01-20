package com.assignments.abstractdatatype;

public class CourseManagement {
	public static void main(String[] args) {
		int studentId = 1004;
		char studentType = 'F';
		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentType(studentType);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
	}
}
