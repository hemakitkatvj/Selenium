package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.PortUnreachableException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WHandle {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programes\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");   
		
		Actions a = new Actions(driver);   // Actions    
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  ']) [2]"));
		a.contextClick(mobile).build().perform();
		
		Robot rob = new Robot(); // keybords
		
		rob.keyPress(KeyEvent.VK_DOWN);   
		rob.keyRelease (KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement book = driver.findElement(By.xpath("(//a[@class='nav-a  ']) [4]"));
		a.contextClick(book).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);   
		rob.keyRelease (KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement customer = driver.findElement(By.xpath("(//a[@class='nav-a  ']) [5]"));
		a.contextClick(customer).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
//		**************************************************************************************************************************************
		                                      //Windowhandle
		
		String  windowHandle= driver.getWindowHandle(); //windownhandle is use to get a title 
		System.out.println(windowHandle);
		
		
//		**************************************************************************************************************************************
		
		
		Set<String> la = driver.getWindowHandles();    // set will not allow dup   // handles will  get the tiles of all the tab 
		for (String str : la) {           //foreach
			String title = driver.switchTo().window(str).getTitle();      
			System.out.println(title);  
		
		}
//		***************************************************************************************************************************************
		
		// if we know the title or url we shall use this method
		
		String st = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in\r\n";
		for (String know : la) {
			if(driver.switchTo().window(know).getTitle().equals(st)){
			
			break;
			
		}
			
		String url = "https://www.amazon.in/Text-Books/b/?ie=UTF8&node=4149418031&ref_=sv_ba_6";
		for (String str : la) {
			if(driver.switchTo().window(str).getTitle().equals(str)) {
				break;
			}
		}
		 
	
//	*********************************************************************************************************************************************
		
			
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}

