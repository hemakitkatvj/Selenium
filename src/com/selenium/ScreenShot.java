package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

 		
	//	TakesScreenshot s = (TakesScreenshot) driver;  
	//	File src = s.getScreenshotAs(OutputType.FILE);  //how to save
		// File dest = new File("D:\\Java Programes\\Selenium\\pic\\error1.png");  // where to save
		// FileUtils.copyFile(src , dest); //   copy the file 
		
		
		TakesScreenshot a = (TakesScreenshot) driver;
		File src = a.getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\\\Java Programes\\\\Selenium\\\\pic\\\\error22.png");
		FileUtils.copyFile(src, dest);
//FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
		
		
	}

}
