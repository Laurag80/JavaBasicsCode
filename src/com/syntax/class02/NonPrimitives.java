package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name= "Oleg";
		
		String lastName= "Smith";
		
		long phone= 1234567890;
		
		//xxx-xxx-xxxx
		
		String phonenNumber= "123-456-7890";
		
		String address= "123 Washington str";
		String age= "30";
		String city= "Miami";
		city= "Los Angeles";
		
		//short type for printing
		//type syso +ctrl +space --> hit enter
		
		/*
		 * we can use +
		 *             to attach String to String
		 */
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Oleg lives in Miami
		
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
		System.out.println(name+" is "+age+" years old");
		
	
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2 no keyword
		 * 3. cannot start  with numbers (numbers can be used after the letter)
		 * 4. Can not have with special character (except _, $)
		 */
		//String break="Hello";
		//int 1number= "Hello";error
		int number1=10;
		
		//int num%=20; error
		double $price= 3.99;
		float f= 2.00f;
		
		/* Naming Conversation
		 * follow came casing
		 * variable names should start with lowercase and then follow camel casing
		 * class should start with uppercase
		 */
		String MyCity="Tysons";
		
	}
}
