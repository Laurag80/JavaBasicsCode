package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {

		/*
		 * we are going to ask if you got a job
		 * we will countinously asking if you get a job untill you say yes!
		 * 
		 * once you say yes--> Congratulations!
		 */
		Scanner scan=new Scanner(System.in);
		String job;
		
		do {
		System.out.println("Did you get a job");
		job=scan.next();
	}while(!job.equalsIgnoreCase("Yes"));
		System.out.println("Congratulations");
		System.out.println("----------------------");
		
		Scanner input=new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job");
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Cogratulations");
		
	}

}
}
