package com.syntax.class08;

public class HW3 {

	public static void main(String[] args) {
		
		/*Using nested loop, create a 24 hour clock that will display 
		 * 2 digits for an hour and 2 digits for a minute.
		 */
		
		for (int h=0; h<=2; h++) 
		for (int h1=0; h1<=3; h1++) 
			for (int m=0; m<=5; m++) 
			for (int m1=0; m1<=9; m1++) 
				if(h<=2 && h1<=4 && m<=5 && m1<=9) {
						System.out.println(h+" "+h1+" : "+m+" "+m1);
	}

  }
}