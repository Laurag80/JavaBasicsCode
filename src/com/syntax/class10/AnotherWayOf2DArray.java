package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		
		//create 2d array of states
				/*
				 * 1 array-> NY--> all cities of NY state
				 * 2 array-> CA--> all cities of CA state
				 * 3 array-> FL--> all cities of FL state
				 * 4 array-> VA--> all cities of VA state
				 */
				
				String[][]usa= {
						
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", },
			    {"Miami", "Orlando", "Niceville", "Tampa"},
			    {"McLean", "Richmond", "Leesburg"},
				
				};
				System.out.println(usa[1][2]);
				System.out.println("I want to go to "+usa[2][0]);
				
				//how many element in my first array
				
				int elem1array=usa[0].length;
				System.out.println("# of elements in 2 array ="+elem1array);
				
			}
		}
