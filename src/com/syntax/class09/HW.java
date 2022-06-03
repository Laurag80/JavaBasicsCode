package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an
		 * hour and 2 digits for a minute. Example: 10:00 10:01 etc.
		 */
//		int hour, min;
		
		for (int hour = 0; hour <= 24; hour++) {
			
			for (int min = 0; min <= 59; min++) {
				if (hour < 10 && min < 10) {
					System.out.println("0" + hour + ":" + "0" + min);
				} else if (hour >= 10 && min >= 10) {
					System.out.println(hour + ":" + min);
				}
			}
		}
	}

	}



