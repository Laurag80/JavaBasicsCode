package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {


		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Do you have a sale today?");
		boolean sales = in.nextBoolean();
		
		if (sales==true) {
			System.out.println("Please enter the price of the item");
			int price=in.nextInt(); double s=0; double discount=0;
			if(price<=20 && price<100) {s=(price- (price*(10/100))); discount =10;}
			else if (price>20 && price<100) {s=(price-(price*0.20)); discount =20; }
			else if (price>100 && price<500) {s=(price - (price*0.30)); discount=30;}
			else {s = (price - (price*(0.5))); discount = 50;}
			System.out.println("After discount of "+discount+ "% the price of the reduce");
			}else System.out.println("I am not shopping");
			
		
		
			 
	}
	
}
