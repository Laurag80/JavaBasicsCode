package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*we need to check if repl was completed
		 * 
		 * if repl is completed we want to see
		 * if you did 15 and more --> great job
		 * if you did more than 10 -> did good
		 * if less than 10-> try complete all assignments
		 */
		boolean didRepl=true;
		int assignments=17;
		if (didRepl) {
		System.out.println("How many assignments have you done");
		assignments=14;
		
		if (assignments>15) {
			System.out.println("You did a good job");
		}else { if(assignments>10) {
				System.out.println("You should complete all Repl HW");
				
		}else {
			System.out.println("You should complete Repl HW");
			}
			System.out.println("-----------------");
			/*
			 * Write a program to store a value whether user has 
			 * diploma or not. If user has a diploma, you should say congratulations, 
			 * otherwise program should suggest to get a degree. Then if user has a 
			 * degree program should check a gpa score. If gpa score
			 *  is higher or equals to 3.5 → output should say “You are eligible 
			 *  for scholarship”, otherwise → “You should have studied harder” .
			 */
			/*Create a Java program and store values
			 *  of mortgage rate and mortgage price. First, program should check 
			 *  if rate is higher than 4.5 user will not buy a house, 
			 *  otherwise user will consider buying. Once user decides to buy a 
			 *  house, if price of the house is larger than 50000 than user will 
			 *  take a loan, otherwise user will pay cash.
			 */
			System.out.println("---------");
		}
		boolean haveDiploma=true;
		double gpa=3.8;
		
		if(haveDiploma) {
		System.out.println("Congratulations");
		if (gpa>3.5) {
			System.out.println("you are eligible for scholarship");
		}else {
			System.out.println("you should have studied harder");
		}
		}else {
			System.out.println("get a dgree");
			
		}
		}
		
		
		
		
		}

	}


