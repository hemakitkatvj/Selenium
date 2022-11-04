package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	
//		WebElement clickme1 = driver.findElement(By.id("alertButton"));
//     	clickme1.click();
//		driver.switchTo().alert().accept();
		
		
//    	WebElement clickme2 = driver.findElement(By.id("timerAlertButton"));
//		clickme2.click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		
		
		WebElement click3 = driver.findElement(By.id("confirmButton"));
		click3.click();
		driver.switchTo().alert().accept();
		
		
//		WebElement click4 = driver.findElement(By.id("promtButton"));
//		click4.click();
//		driver.switchTo().alert().dismiss();

		
	

}
}