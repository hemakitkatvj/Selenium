package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);    //mouse based
		
		WebElement service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		act.contextClick(service).build().perform(); //right click we use  contextclick();
		
		Robot rob = new Robot(); //Robot is a class , keyboard based 
		
		
		rob.keyPress(KeyEvent.VK_DOWN); //down moving press
		rob.keyRelease (KeyEvent.VK_DOWN); //down moving release
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease (KeyEvent.VK_DOWN);
	
		rob.keyPress(KeyEvent.VK_ENTER); //enter press
		rob.keyRelease (KeyEvent.VK_ENTER); //enter release
		
		
//		*******************************************************Move the mouse to the middle of the element
		
//		WebElement homeoffice = driver.findElement(By.xpath("//h2[text()='Electronics devices for home office']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(homeoffice).build().perform();

		
		
		
		
		
		
	}

}
