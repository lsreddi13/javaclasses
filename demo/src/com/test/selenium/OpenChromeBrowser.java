package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	static String url = "http://www.fb.com"; // global var

	// local vars
	static String loginUserName = "Admin";
	static String loginPassword = "admin123";

	static String userRole = "ESS";
	static String employeeName = "sriram";
	static String userName = "hanuman";
	static String status = "Enabled";
	static String password = "pwd123";
	static String confirmpassword = "pwd123";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch the browser

//		ChromeDriver driver = new ChromeDriver(); //		
		driver.get(url); // it will launch applicaiton.
		OpenChromeBrowser obj = new OpenChromeBrowser();
		obj.login(loginUserName, loginPassword);

//		createNewUser(userRole, employeeName, userName, status, password,confirmpassword  );
		createNewUser2(userRole, employeeName, userName, status, password,confirmpassword  );
		
		// close the browser
		driver.close();

	}

	public void login(String name, String password) { // pass the parameters in the methods
		// pass the arguements in the methods.

		System.out.println(name);
		System.out.println(password);

	}

	public static void createNewUser(String var1, String var2, String var3, String var4, String var5, String var6) {

		System.out.println(var1);
		System.out.println(var2);

		System.out.println(var3);

		System.out.println(var4);

		System.out.println(var5);

		System.out.println(var6);

	}

	
	public static void createNewUser2(String var1, String var2, String var3, String var4, String var5, String var6) {

		System.out.println(var1 +", "+var2 +", "+var3 +", "+var4+", "+var5+", "+var6+".");
		

	}
}

//Task:
//open firefox browser
//open safari browser
//open opera browser
//edge browser