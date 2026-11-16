package com.day2.demo;

public class demoSwitch {

	public static void main(String[] args) {

		String browserName = "edge";
//6 programs
		switch (browserName) {
		case "chrome":
			System.out.println("chrome");
			break;
		case "firefox":
			System.out.println("firefox");
			break;
		case "safari":
			System.out.println("safari");
			break;
		case "edge":
			System.out.println("edge");
			break;
		default:
		
			System.out.println("chrome");
			
			break;
		}

	}

}
