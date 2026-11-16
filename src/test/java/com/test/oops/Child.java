package com.test.oops;

import org.testng.annotations.Test;

public class Child extends Parent{
	//inheritance - oops 
	//abstraction
	//encapsulation
	//polymorphism
	
	@Test
	public void test() {
	
		//print course name
		System.out.println(course);
		//print stu name
		System.out.println(stuname);
		
		//call method 
		testLogin();
		testSignin();
		checkLogin();
		
		
	}

}
