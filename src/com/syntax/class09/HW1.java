package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		String[] cars=new String[6];
		
		cars[0]="Nisan";
		cars[1]="Kia";
		cars[2]="BMW";
		cars[3]="Acura";
		cars[4]="Jaguar";
		cars[5]="Honda";
		for ( int i=0; i<cars.length; i++) {
		
		
		System.out.println(cars[i]+" ");
		

	}
		System.out.println("-------Enhanced Method--------");
		for(String a:cars) {
			System.out.println(a+" ");
		}
}
}
