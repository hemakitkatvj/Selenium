package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
//		*************************************************************DOUBLE CLCIK
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(dc).build().perform();
		
//	    **********************************************************right click	
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		Actions actt= new Actions(driver);
		actt.contextClick(rc).build().perform();
		

		
		


		
	}

}
