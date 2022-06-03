package com.syntax.class10;

import java.util.Scanner;

public class GrpoupProjectA {

	public static void main(String[] args) {
		
		
		/*Using Scanner create an array of integer values. After the array is created, 
		 * calculate the sum of all stored elements in that array.
		 */
		
			Scanner scan=new Scanner(System.in);
			int size=scan.nextInt();
			
			int n;    //Declare array size
		      System.out.println("Enter the total number of elements ");
		      n=scan.nextInt();     //Initialize array size

		      int arr[]=new int[n];   //Declare array
		      System.out.println("Enter the elements of the array ");
		      for(int i=0; i<n ;i++)   
		      {
		          arr[i]=scan.nextInt();
		      }
		      int sum = 0;    
		     
		      while(n!=n)
		      {
		          sum=sum+arr[n];   
		          n++;    
		      }
		       
		       //Print the sum
		        System.out.println("The sum of all the elements in the array is "+sum);
			

}
}