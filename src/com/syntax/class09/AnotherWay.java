package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {


		String[]fruits= {"mango", "apple", "kiwi", "pear"};
		System.out.println(fruits[2]);
		fruits[2]="peach";
		System.out.println("My favorite fruit is " +fruits[0]);
		
		//I want to find a size of an array/how many elements?
		
		int size=fruits.length;
		System.out.println(size);
		
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		System.out.println("------------------");
		String[] grade=new String[6];
		grade[0]="A";
		grade[1]="B";
		grade[2]="C";
		grade[3]="D";
		grade[4]="E";
		grade[5]="F";
		System.out.println(grade[1]);
		
		//another way
		System.out.println("-----------");
		
		char[] grade1 = {'A','B', 'C', 'D', 'E', 'F'};
		System.out.print(grade1[0]);
		System.out.print(grade1[1]);
		System.out.print(grade1[2]);
		
		for (int i=0; i<grade.length; i++){
			System.out.print(grade[i]+" ");
		}
		String[] words= {"Java", "Saturday","day"};
		System.out.println();
		for (int i=0; i<words.length; i++) {
		System.out.println(words[i]+" ");
	}
		/*Enhanced for loop/ advanced for loop/for each loop
		 * can be used only when we work with array
		 * 				or
		 * 			collections
		 */
		
		String[] color= {"pink", "blue", "white", "black"};
		System.out.println(color+" ");
		
		System.out.println();
		
		int [] numbers= {10, 20, 30, 40};
		for (int num:numbers) {
			System.out.println(num);
			
		}
}
}
			