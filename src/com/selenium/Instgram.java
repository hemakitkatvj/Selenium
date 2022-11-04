package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
	    
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement email= driver.findElement(By.name("username"));
		email.sendKeys("9897989s");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("ioijskdn");
		
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		 
		
	
	}
	
	
	

}
