package com.syntax.class05;

public class HW {

	public static void main(String[] args) {
		// 
		
		int num1= 65;
		int num2= 66;
		int num3= 23;
		
		if (num1 >= num2) {
			 if (num1 >=num3) {
				 System.out.println(num1+" is largest number");
			 }else {
				 System.out.println(num3+" is largeer");
			 }
		}else {//otherwise num2>num1
			
			if (num2>num3) {
				System.out.println(num2+" is largest number");
			}else { // num3>num2
				
				System.out.println("is is the largest number");
			}
			
		}
		


	}

}
