package com.test.basic.java;

public class HelloWorld {

	// Create global variables
	static String name = "selenium";

	public static void main(String[] args) {
		// Create local variables
		int age = 30;
		System.out.println(name);
		System.out.println(age);
		login();
		HelloWorld obj = new HelloWorld();
		obj.logout();
	}

	public void logout() {
		// local variable
		double height = 5.8;
		System.out.println(height);
		System.out.println("i am logout method - nonstatic");
	}

	public static void login() {
		System.out.println("i am login method - static ");

	}

}
