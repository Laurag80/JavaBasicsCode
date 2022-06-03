package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {


		//create a array
		int[] b=new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my arrey
		System.out.println(b[2]);
		System.out.println(b[1]+b[3]);
		
		//we need to create an array of my array of my classmates
		String[] classMates=new String[5];
		
		classMates[0]="Khristina";
		classMates[1]="Zameer";
		classMates[2]="Elexa";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		
		System.out.println("My classmate name is "+classMates[3]);

	}

}
