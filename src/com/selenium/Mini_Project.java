package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hemakitkat");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("vijayhema");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
//**********************************************************************************************************************
		WebElement location = driver.findElement(By.id("location"));
		Select a = new Select(location);
		a.selectByValue("New York");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b = new Select(hotels);
		b.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select c = new Select(roomtype);
		c.selectByIndex(4);
		
		WebElement norooms = driver.findElement(By.id("room_nos"));
		Select d = new Select(norooms);
		d.selectByValue("10");
		
		WebElement checkin= driver.findElement(By.xpath("//input[@name= 'datepick_in']"));
		checkin.sendKeys("09/09/2022");
	
		WebElement checkout = driver.findElement(By.xpath("//input[@name= 'datepick_out']"));
		checkout.sendKeys("19/09/2022");
		
		WebElement perroom = driver.findElement(By.id("adult_room"));
		Select e = new Select(perroom);
		e.selectByVisibleText("4 - Four");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select f = new Select(child);
		f.selectByVisibleText("0 - None");
		
		WebElement Sudmit1 = driver.findElement(By.id("Submit"));
		Sudmit1.click();
		
//		********************************************************************************************************************
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@name= 'radiobutton_0']"));
		radio1.click();
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
//		**************************************************************************************************************************
		
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("hema");
			
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("latha");
			
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("12/48, anna nager, 2nd street, chennai-97");
		
		WebElement cardno = driver.findElement(By.xpath("(//input[@type= 'text'] )[13]"));
		cardno.sendKeys("1234567890678945");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name ='cc_type'] "));
		Select m = new Select(cardtype);
		m.selectByVisibleText("VISA");
		
		WebElement expired = driver.findElement(By.xpath("//select[@name='cc_exp_month'] "));
		Select o = new Select(expired);
		o.selectByVisibleText("November");
		
		WebElement exyear = driver.findElement(By.xpath("//select[@name='cc_exp_year'] "));
		Select p = new Select(exyear);
		p.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv'] "));
		cvv.sendKeys("9875");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now'] "));
		book.click();
	
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
