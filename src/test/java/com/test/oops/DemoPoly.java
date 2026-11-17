package com.test.oops;

public class DemoPoly {

	// poly - method overloading(compile time polymorphism &
	// method overriding ( run time polymorphism)

	void testLogin() {

	}

	void testLogin(int x) {

	}
	
	void testLogin(String x) {

	}
	
	void testLogin(int x, int y) {

	}
	
	void testLogin(String x, String y) {

	}
//	testLogin("dfas", 34)
	void testLogin(String x, int y) {

	}
//	testLogin(34, "fasdf");
	
	void testLogin(int x, String y) {

	}
	

}
