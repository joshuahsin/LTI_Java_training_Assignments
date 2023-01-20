package com.Day3Assignments;

public class JaggedArray {
	static String[][] array1 = {{"Tony", "JAVA", "C", "C++"},
			{"Thomas", "Java", "UNIX"}, 
			{"Dinil", "Linux", "Oracle"},
			{"Delvin", "RDBMS", "C#", "ORACLE"}};
	
	public static void main(String[] args) {
		for(String element: array1[3]) {
			System.out.println(element);
		}
	}
}
