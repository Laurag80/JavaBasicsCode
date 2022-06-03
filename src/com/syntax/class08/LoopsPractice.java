package com.syntax.class08;

import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		

		int sum=0;
		for (int i=1; i<6; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	/*write a program to find sum of all even and all odd numbers
	 * from 1 to 70
	 */
	int sumEven=0;
	int sumOdd=0;

	for (int i = 1; i <= 70; i++) {

	if (i % 2 == 0) {
	sumEven+=i;
	}else {
	sumOdd+=i;
	}
	}

	System.out.println("Sum even numbers is "+sumEven);
	System.out.println("Sum odd numbers is "+sumOdd);
	
	/*
	 * declare a secret number;
	 * you want to ask user to guess your secret n number
	 * your code should keep asking to guess until user gets your secret number
	 * Once user gets the secret numbers -> you get it!
	 */
	
	
		}
		
}
