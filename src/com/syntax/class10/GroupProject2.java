package com.syntax.class10;

import java.util.Scanner;

public class GroupProject2 {

	public static void main(String[] args) {
		
		/* Using Scanner create an array of countries. When an array is created, 
		 * retrieve all values from it and while retrieving those values print capital for each country.
		 *  (use 2 different loops).
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many countries you want to enter -");
		int size=scan.nextInt();
		String capital=null;
		for (int i=0; i<size; i++) {
			
			System.out.println("Enter country's name");
			String country=scan.next();
			if (country.equalsIgnoreCase("Armenia")) {
				capital="Yerevan";
			}else if (country.equalsIgnoreCase("Italy")) {
				capital="Rome";
			}else if(country.equalsIgnoreCase("France")) {
				capital="Paris";
			}else if (country.equalsIgnoreCase("Germany")) {
				capital="Berlin";
			}

		System.out.println(country+" = "+ capital);
	}

}
}
