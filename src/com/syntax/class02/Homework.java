package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		// whole numbers
		/*
		 * box1 - is variable
		 * to create a variable we need 2 things: datatype & name
		 */
		//
		
		byte box1= 21;
		short box2= 2022;
		int box3= 7666; //mostly will be used
		long box4= 75827982L;
		
		//decimal values
		
		float container= 1.99f;
		double container2= 89.99;
		
		//to represent 1 character
		
		char gender= 'm';
		char dollar= '$';
		
		//to represent true or false (yes or no)
		
		boolean hungry= true;
		boolean sleepy= false;
		
		//how to access values from variables
		//do not use "" to access variables
		
		System.out.println(box1);//calling a variable box1
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container);
		System.out.println(container2);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		
		System.out.println(sleepy);//false
		System.out.println("sleepy");//sleepy
		
		//system.out.println(box5); This line will give error because
		int box5=900;
		System.out.println(box5);
		
		int year=2023; //create variable and store value
		System.out.println(year);//2022
		
		year =2023;//reassigning the value of the same box
		System.out.println(year);//2023;
				
				}

}
