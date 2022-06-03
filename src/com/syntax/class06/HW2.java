package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		/* Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent,
		 * B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print
		 *   which grade was entered by a user with explanation.
		*HW: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		*Based on operator provide the result to user.
		 *Please complete this assignment in 2 ways: using if statement and switch case.
		*/
		
		Scanner inp =new Scanner(System.in);
		System.out.println("Where are you from");
		
		String country=inp.nextLine();
		String language;
		if (country.equals("Armenia")) {
		language="Armenian";
		
	}else if (country.equals("Spain")) {
		language="Spanish";
	}else if (country.equals("India")) {
		language="Hindi";
	}else {
		language="unknown";
	}	
		System.out.println("language is "+ language);
		
		
	
		
		
	
		
		
		

	}

}
