package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		
		/* Create an array to store double values and then print all elements 
		 * using 2 different loops
		 */
		
		double[] price= {22.99,33.99,44.99,55.99,};
		for(int b=0; b<price.length; b++) {
			System.out.println(price[b]+" ");
		}
		System.out.println("-------2nd way--------");
		
		for (double c:price) {
			System.out.println(c+" ");
		}
	}
}
