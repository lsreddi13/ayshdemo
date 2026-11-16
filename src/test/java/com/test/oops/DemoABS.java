package com.test.oops;

import org.testng.annotations.Test;

public class DemoABS extends DemoAbstract{


	public void mul(int x, int y) {
		int total = x * y;
		System.out.println("mul value : "+total);
		
	}
	
	public  void div(int x, int y) {
		int total = x / y;
		System.out.println("mul value : "+total);
		
	}
	
	@Test
	public void genTest() {
		mul(3,4);
		add(3,4);
		div(10,2);
	}
	

}
