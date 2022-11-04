package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		List<WebElement> product = driver.findElements(By.xpath("//span[@class = 'product-strike'] //preceding::span [@class = 'product-discountedPrice' ]"));
		
	}

}
