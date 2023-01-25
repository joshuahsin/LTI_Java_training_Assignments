package com.Day3Assignments;

public class StringManipulate {
	public static void manipulate(String username) {
		System.out.println(username.length());
		System.out.println("Hi " + username);
		username = username.toLowerCase();
		System.out.println(username);
		username = username.toUpperCase();
		System.out.println(username);
		System.out.println(username.startsWith("a"));
		username = "SEED";
		System.out.println(username);
	}
	
	public static void main(String[] args) {
		manipulate("JoshuaHsin124");
	}
}
