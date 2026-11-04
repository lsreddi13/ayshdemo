package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		String str = driver.getTitle();
		
		System.out.println("page title :"+ str);
		
		driver.close();
	}
}
