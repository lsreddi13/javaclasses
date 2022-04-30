package com.java.StringCancatenations;

public class Test2 {

	String str1;
	String str2;
	
	public static void main(String[] args) {
		createUSer();
		verifyUser();
		Test2 ss = new Test2();
		ss.login();
		ss.logout();
	}

	public void login() {
		System.out.println("this is non static and login method");

	}

	public void logout() {
		System.out.println("this is non static and logout method");

	}

	public static void createUSer() {
		System.out.println("this is  static and  createUSer method");
	}

	public static void verifyUser() {
		System.out.println("this is  static and verifyUser method");
	}
}
