package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {

			String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry"};
			System.out.println(disney[1]);// Elsa
			
			System.out.println("All elements using regular for loop----");
			//to get all elements from array
			
			for(int i=0; i<disney.length; i++) {
				
				if(disney[i].equalsIgnoreCase("Shrek")){
				System.out.println(disney[i]+" ");
			}
			System.out.println("All elements using Enhanced for loop----");
			
			for(String charachter:disney) {
				if(charachter.equalsIgnoreCase("Mulan")) {
					System.out.println("This is my favorite carachter");
				}else {
				System.out.println(charachter+""+ " ");
			}
	}

}
}
}
