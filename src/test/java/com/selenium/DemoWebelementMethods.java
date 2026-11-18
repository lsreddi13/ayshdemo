package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebelementMethods {

	@Test
	public void testWebelementMethods() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box?");

		boolean fullNameTextisDisplayed = driver.findElement(By.id("userName-label")).isDisplayed();//true / false
		
		System.out.println("fullNameTextisDisplayed - "+fullNameTextisDisplayed);
		
		String fullNameText = driver.findElement(By.id("userName-label")).getText();

		System.out.println("fullNameText - "+fullNameText);
		
		String fullNameType = driver.findElement(By.id("userName-label")).getAttribute("class");

		System.out.println("fullNameType - "+fullNameType);

		
		String emailText = driver.findElement(By.id("userEmail-label")).getText();

		System.out.println("emailText - "+emailText);
		String signBtnText = driver.findElement(By.id("submit")).getText();
		System.out.println("signBtnText - "+signBtnText);
		String signInBtnType = driver.findElement(By.id("submit")).getAttribute("type");
		System.out.println("signInBtnType - "+signInBtnType);
		
		boolean signBtnIsEnabled = driver.findElement(By.id("submit")).isEnabled();//true / false
		System.out.println("signBtnIsEnabled - "+signBtnIsEnabled);
		
		
		driver.close();
		
	}

}
