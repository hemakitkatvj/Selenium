package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		****************************************************************************************************
//		                                   find size of the frames
		
//		int size = driver.findElements(By.tagName("iframe")).size();   // to find total number of frames in the url
//		System.out.println(size);
		  
//		***********************************************************************************************
		                         // SINGLE FRAME
		WebElement outer = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(outer);
		
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		send.sendKeys("vijay");
		driver.switchTo().defaultContent();
	
		
//		*************************************************************************************************
		
		                        //MULTIPLE FRAME
//		WebElement mframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
//		mframe.click();
//		WebElement aa = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
//		driver.switchTo().frame(aa);
//		WebElement bb = driver.findElement(By.xpath("//iframe[@style= 'float: left;height: 250px;width: 400px']"));
//		driver.switchTo().frame(bb);
//		WebElement sendto= driver.findElement(By.xpath("//input[@type='text'] "));
//		sendto.sendKeys("hema");
//		driver.switchTo().defaultContent();

	
	
		
		
		
		

	
	}

}
