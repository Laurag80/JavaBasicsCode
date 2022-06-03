package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		 
		/*Create an array of animals and store 5 elements into it.
		 *  Using 2 different loops print all elements from the array.
		 */
		
		String[] animals= {"dog", "cat", "pig", "goat", "donkey"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]+" ");
		}
		
		System.out.println("------Enhanced Method-------");
		for(String a:animals) {
			System.out.println(a+" ");
		}
		
		


	}

}
