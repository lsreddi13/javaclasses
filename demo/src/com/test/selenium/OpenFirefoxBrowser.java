package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch Firefox Browser
public class OpenFirefoxBrowser {
	
	static String url = "http://www.fb.com";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		
		
	}
	

}

//Task:
//open firefox browser
//open safari browser
//open opera browser
//edge browser