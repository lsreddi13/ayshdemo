package com.test.oops;

import com.day2.demo.Parent2;

public class Parent extends Parent2{
	
	String stuname = "yashwant";
	String course = "Selenium";
	
	public void testLogin() {
		System.out.print("this is test login method from parent class");
	}
	
	
	private void checkLogin() {
		System.out.println("this is private method from parent class");
	}
	
	
	protected void testSignin() {
		System.out.println("this is protected method");
	}

}
