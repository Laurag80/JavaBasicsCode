package com.syntax.class06;

public class SwichDemo {

	public static void main(String[] args) {

		char choice='Y';
		String meaning;
		
		switch(choice){
			
			case 'Y':
				meaning="Yes";
				break;
				
			case 'M':
				meaning="Maybe";
				break;
			case 'N':
				meaning="No";
				break;
				default:
					meaning="Unknown";
		}
			System.out.println(meaning);
		}

	}
