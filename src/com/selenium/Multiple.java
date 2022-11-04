package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement cof = driver.findElement(By.name("coffee2"));
		Select s = new Select(cof);
		s.selectByValue("milk2");
		s.selectByValue("whipped");
		s.selectByValue("donut");
		s.selectByValue("muffin");
	
		List<WebElement> all = s.getAllSelectedOptions(); // Dispaly all the options u have selected
		for(WebElement web : all) {
			System.out.println(web.getText());
			
		}
		List<WebElement> options = s.getOptions(); // Display all the options in the list
		for(WebElement web : options) {
			System.out.println(web.getText());
		}
		
		s.deselectAll(); // it will deselect all the option 
		
		}
		
	}


