package com.test.oops;

import org.testng.annotations.Test;

public class TestInterfaces extends Parent implements DemoInterface1, DemoInterface2, DemoInterface3{

	
	public void add(int x, int y) {
		int total = x+y;
		System.out.println("this is addition"+total);
		
	}

	
	public void div(int x, int y) {
		// TODO Auto-generated method stub
		int total = x/y;
		System.out.println("this is div"+total);
	}

	
	public void mul(int x, int y) {
		// TODO Auto-generated method stub
		int total = x*y;
		System.out.println("this is mul"+total);
	}

	
	@Test
	public void test() {
		testLogin();
	}
}
