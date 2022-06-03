package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
	//Create a program that will keep asking user to apply for a credit card. As soon you get 
	//“yes” from a user program should stop asking.

		Scanner scan = new Scanner(System.in);
		String card;
		do {
			System.out.println("Did you apply for a credit card. Please enter yes or no");
			card = scan.next();
		} while (!card.equalsIgnoreCase("yes"));{
			System.out.println("Thank you for applying for a credit card");
			scan.close();
		}
	}

}
