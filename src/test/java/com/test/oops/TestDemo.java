package com.test.oops;

import org.testng.annotations.Test;

public class TestDemo {
	
	private int sal;
	
	
	
	
	@Test
	public void testLogin() {
		
		DerivedDemo dd = new DerivedDemo();
//		BaseDemo bd = new BaseDemo();
//		BaseDemo bd =new DerivedDemo();
//		DerivedDemo bd =new BaseDemo();
		dd.login();
//		dd.signup();
		setSal(400000);
		int value = getSal();
		System.out.println(value);
		
	}




	public int getSal() {
		return sal;
	}




	public void setSal(int sal) {
		this.sal = sal;
	}

}
