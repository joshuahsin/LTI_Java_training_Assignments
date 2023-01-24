package com.CaseStudy3;

public class AutoGenerate {
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder("115T");
		
		
		char type = input.charAt(3);
		if(type == 'F') {
			input.append("1020001");
		}
		else if(type == 'T') {
			input.append("2020002");
		}
		else {
			input.append("3040003");
		}
		System.out.println(input.toString());
	}
}
