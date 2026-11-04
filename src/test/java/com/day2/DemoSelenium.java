package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSelenium {
	int a= 5;
	String URL = "https://www.facebook.com/";
	
	
	@Test
	public void testLogin() {
		
		WebDriver driver = new ChromeDriver(); // 
		driver.get(URL);
		driver.findElement(By.id("_R_c9l6neappb6amH1_")).sendKeys("sasidhar");
		
		//driver methods - 
		
		
		
		//webelement methods - 
		
		//locators
		
		driver.findElement(By.id("_R_c9l6neappb6amH1_")).clear();
		
		driver.findElement(By.xpath("//span/span[contains(text(), 'Log in')]")).click();
		
	}

}
