package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe"); //map
	//interface     //upcasting         //class
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");

	
	//Navigate
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	
	}
	

}
