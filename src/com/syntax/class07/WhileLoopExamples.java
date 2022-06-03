package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {


		// print numbers 1 to 10
		
		int num=1;
		
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		// print numbers 10 to 100;
		
		int a =10;
		
		while (a<=100) {
			System.out.println(a+" ");
			a++;
		}
		// print numbers from 10 to 1
		System.out.println("-----------");
		
		int b=10;
		while(b>=10) {
			System.out.print(b);	
			b--;
	}
		// print numbers from 100 to 50
		System.out.println("------------------");
		
		int c=100;
		while (c>=50){
			System.out.println(c+" ");
			c--;
		}
		System.out.println();
		int f =1;
		while (f <=20) {
			if (f % 2 == 0) {
				System.out.println(f+ " ");
				f++;
			}
		}
		//Print even numbers from 20 to 100
		//Print only odd numbers from 100 to 1
		
			System.out.println();
			int g=20;
			while (g>=100) {
				if (g>=20) {
				System.out.println(g+" ");
				g++;
			}
			System.out.println();
			int h=100;
			while (h<=1) {
				System.out.println(h+" ");
				h++;
			}
}
}
}