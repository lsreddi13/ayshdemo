package com.test.oops;

import org.testng.annotations.Test;

import com.day2.demo.Parent2;

public class Child2 extends Parent2{
	//inheritance - oops 
	//abstraction
	//encapsulation
	//polymorphism
	
	@Test
	public void test() {
//		Parent2 pp = new Parent2();
//		pp.testSignin();
		
		testSignin();
		String str = testSignin2();
		System.out.println(str);
		
		
		
	}

}
