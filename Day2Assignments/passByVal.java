package com.Day2Assignments;

import com.assignments.abstractdatatype.Student;

public class passByVal {
	public void passTheValueMethod(Student student) {
		student.setStudentId(11);
		System.out.println("The sId are " + student.getStudentId());
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(10);
		student.setStudentType('F');
		
		passByVal val = new passByVal();
		System.out.println(student.getStudentId());
		
		val.passTheValueMethod(student);
		System.out.println("The sId are " + student.getStudentId());
	}
}
