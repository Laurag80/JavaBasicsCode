package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		
		// Create an array on integers and calculate the sum of all elements in an array
		
		int[] numbers= {10, 20, 30, 40, 50};
		int sum=0;
		for(int num:numbers) {
			sum += num;
		}

		System.out.println(sum);
		
		
		System.out.println("----------2nd way-----------");
		
		sum=0;
		for (int num:numbers) {
			sum += num;
			
		}
	
		System.out.println(sum);
	}
	
}
