package com.test.oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoOverLoading {
	WebDriver driver;

	public void login(String uname, String pwd) {
		enterUserName(uname);
		enterPwd(pwd);
		clickLoginBtn();
	}

	
	public void login(String uname, String pwd, String warningmessage) {
		enterUserName(uname);
		enterPwd(pwd);
		clickLoginBtn();
		verifyWarning(warningmessage);

	}

	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	public void enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	public void clickLoginBtn() {
		driver.findElement(By.id("loginSubmitBtn")).click();
	}

	public void verifyWarning(String msg) {
		boolean warningMsgIsDisplayed = driver.findElement(By.xpath("//p[contains(text(), 'Login failed')]"))
				.isDisplayed();
		
		String errorMsg = driver.findElement(By.xpath("//p[contains(text(), 'Login failed')]/following-sibling::p")).getText();
		System.out.println("warningMsgIsDisplayed : " + warningMsgIsDisplayed);
		if(msg.equals(errorMsg)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Failed.");
		}
		
	}

	@Test
	public void testValidLogin() {

		driver = new ChromeDriver();
		driver.get("https://www.playwrightautomation.com/login.html?redirect=%2Fpractice.html");
		login("student", "Password123");
			
	}
	
	
	@Test
	public void testInvalidLogin() {
		String errorMsg = "Username or password is incorrect. Please try again.";
		driver = new ChromeDriver();
		driver.get("https://www.playwrightautomation.com/login.html?redirect=%2Fpractice.html");
		login("student", "Password3", errorMsg);
			
	}
}
