package com.selenium;

import java.net.PortUnreachableException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesbro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		System.out.println("=======Allheader============");
		List<WebElement> allheader = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (WebElement all : allheader) {
			System.out.println(all.getText());
			
		}
	
		
		
		
		
		
	}

}
