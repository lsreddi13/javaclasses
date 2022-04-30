package com.test.basic.java;

public class demoDatatypes {
	
	//non static vars
	static double sal = 5.5;
	static int exp=5;
	static String emp="abc";
	
	public static void main(String[] args) {		
		demoDatatypes obj = new demoDatatypes();
		//empData (int, double, string)
		obj.empData(exp, sal, emp);		// int, double, string
		
	}
	
	
	public void empData(int a, double b, String c) { // int, double, string
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}

//Task : Create multiple classes
//create multiple methods
//pass the parameters with different data types.


