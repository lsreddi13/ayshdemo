package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		String str = driver.getTitle();
	
		
		System.out.println("page title :"+ str);
		
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("dfasdfasd");
		driver.findElement(By.id("_R_cdl6neappb6amH1_")).sendKeys("fasdF");
		
//		driver.close();
		
		
	}
}
