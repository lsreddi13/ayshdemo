package com.day2.demo;

public class demoifelseif {
	public static void main(String[] args) {
		
		int a = 1, b=10;

//		
		if(a == b) {
			// condition pass then it will execute
			System.out.println("a equal b");
			
		}else if(a >b){
			System.out.println("a > b");
			//condition fails then it will execute
		}else if (a <b) {
			System.out.println("a < b");
		}else {
			System.out.println("none");
		}
	}

}
