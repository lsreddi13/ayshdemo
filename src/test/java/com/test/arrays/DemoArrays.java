package com.test.arrays;

import java.util.Arrays;

public class DemoArrays {
	
	
	
	public static void main(String[] args) {
		int[] countrycode = new int[5];
//		countrycode[0] = 1
//		countrycode[1]=2
//		countrycode[2]=3
//		countrycode[3]=4
//		countrycode[4]=5
				
		
		for(int i=0; i<5; i++) {
			countrycode[i]=i;
		}
		
		System.out.println(Arrays.toString(countrycode));
		
//		String[] actors= {"nag", "bala", "Chiru", "Venky"};
//		//				actors[0],actors[1],actors[2],actors[3]
//		
//		String actor = "nag";
//		
//		System.out.println(actor);
//		
//		System.out.println(Arrays.toString(actors));
//		System.out.println("array size : "+actor.length());
//		
//		
//		for(int i=0; i<actors.length; i++) {
//			System.out.println("i value : "+i);
//			System.out.println(actors[i]);
//			
//		}
		
	}

}
