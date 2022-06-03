package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {


		//I need to print numbers from 1 to 90
		
		for (int i=1; i<=90; i++) {
			System.out.println(i+" ");
		}
		/*start point
		 * end point
		 * increment/decrement
		 */
		// I need numbers from 60 to 10
		
		for (int i=60; i>=10; i--) {
			System.out.println(i+" ");
		}
		/*Print numbers from 1 to 100 in 1 line with space
		 * Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways)
		 * Print odd numbers between 20 and 50 (2 ways)
		 */
		 
		System.out.println("-------------");
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("-----------");
		for (int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println("-----------");
		for (int i=20; i<=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("-----------");
		for (int m=20; m>=1; m--) {
			if (m % 2 == 0) {
				System.out.println(m+" ");
			}
		}
		
	}

}
