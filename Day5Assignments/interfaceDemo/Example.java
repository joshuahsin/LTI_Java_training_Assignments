package com.interfaceDemo;

public class Example implements InterOne {

	@Override
	public void methodOne() {
		//varTwo = varTwo + 10;
		System.out.println("Value of varTwo: " + varTwo);
		System.out.println("Good Morning");
	}

	@Override
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
	
}
