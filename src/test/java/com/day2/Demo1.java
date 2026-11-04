package com.day2;

public class Demo1 {
	
	//declare two int variables and print them
	
	 int y = 35;
	public void addTwoInt() {
		int a=5;
		int b=6;
		
		
		int c = a+b;
		System.out.println(c);
		System.out.println(y);
		System.out.println(a);
	}
	

	
	public static void main(String[] args) {
		int x = 26;
		
		Demo1 obj = new Demo1();//object for the class
		obj.addTwoInt();
		System.out.println(obj.y);
		
		Class2 newclass = new Class2();
		newclass.addTwoNum(5.4, 3.4);
		
		newclass.addTwoNum(5,6);
		
//		Inr2 aa = new Inr2();
		
		newclass.addThreeNum();
		
		Inr2 aa = new Class2();
		aa.addThreeNum();
	

		
	}
}
