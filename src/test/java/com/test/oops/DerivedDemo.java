package com.test.oops;

import org.testng.annotations.Test;

//child class
public class DerivedDemo extends BaseDemo {

	public void login() {
		System.out.println("login from derived");

	}

	
	@Test
	public void testDemoLogin() {
		signup();
		login();
		
	}
}
