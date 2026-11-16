package com.day1.classdemo;

public class Demo {
	
	int id = 34445; //primitive
	double sal = 60000;
	String employeename = "yash"; // non-primitive


	
	public void printEmpInfo() {
		System.out.println(id);
		System.out.println(sal);
		System.out.println(employeename);
		
		
	}
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.printEmpInfo();
		
	}

}
