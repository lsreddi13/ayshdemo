package com.day2.demo;

public class DemoConditionalStatement {
	static int ram = 5;
	static int jntr = 10;
	static int prabas = 15;
	static int allu = 15;
	public static void main(String[] args) {
		DemoConditionalStatement dd = new DemoConditionalStatement();
		dd.testIFCondtion(ram, jntr);
		dd.testIFCondtion(prabas, jntr);
		dd.testIFCondtion(allu, jntr);
		dd.testIFCondtion(ram, allu);
		dd.testLogin("ramesh", "ramesh123");
		dd.testLogin("suresh", "suresh123");
		dd.testLogin("nagesh", "nagesh123");
		
	}
	
	public void testIFCondtion(int x , int y) {
		
		if (x<y) {
			System.out.println("now i am in if conditoin");
		}else {
			System.out.println("now i am in else condition");
		}
	}
	
	public void testLogin(String uname, String pwd) {
		System.out.println("enter user name : " + uname);
		System.out.println("enter pwd : "+pwd);
		System.out.println("click login");
	}
	

}
