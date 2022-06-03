package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	String job;
	
	do {
	System.out.println("Did you get a job");
	job=scan.next();
}while(!job.equalsIgnoreCase("yes"));
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