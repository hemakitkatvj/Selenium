package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDrop {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement newaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		newaccount.click();
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Kumar");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("9878754358");
		
		WebElement npass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		npass.sendKeys("uugfuyfhlk");
		
		//single drop
		WebElement date = driver.findElement(By.id("day"));
		Select a = new Select(date);
		a.selectByIndex(18);

	
		WebElement name = driver.findElement(By.name("birthday_month"));
		Select b = new Select(name);
		b.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.id("year"));
		Select c= new Select(year);
		c.selectByValue("1997");
		
		WebElement Gender = driver.findElement(By.name("sex"));
		Select d = new Select(Gender);
		d.selectByVisibleText("Male");
		
		
		
		
	}
}
