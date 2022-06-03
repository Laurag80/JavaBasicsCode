package com.syntax.class03;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("where are you from");
		Scanner inp = null;
		String country=inp.nextLine();
		if (country.equals("Armenia")) {

		
		String language;
		switch ( country) {
		case "Armenia":
			language=" Armenian ";
			break;
				
		case "Spain":
			language=" Spanish ";
			break;
			
		case " India ":
		language=" Hindi ";
		break;
		
		default:
			language="unknown";
			break;
		
		}
	}
	}

}
