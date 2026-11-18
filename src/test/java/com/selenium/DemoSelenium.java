package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSelenium {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String pageTitle = driver.getTitle(); // how to verify the page title.
		System.out.println("page ttitle : "+ pageTitle);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.fb.com");
		
		driver.get("http://www.fb.com");
//		driver.findElement(null)
//		driver.findElements(null)
		String windowID = driver.getWindowHandle();
		System.out.println("window ID :"+windowID);
//driver.getWindowHandles()
				driver.close();
//		driver.quit();
	}
	
	
}
