package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/* Monday and Friday _--> No class
		 * Tuesday and Wednesday -> Manual testing
		 * Thursday --> Review
		 * Saturday and Sunday --> Java
		 */
		
		String day="Monday";
		
		if(day.equals("Monday")  || day.equals("Friday")) {
				System.out.println("I have no class");
		
	}else if (day.equals("Tuesday") || day.equals("Wednesday")){
		System.out.println("I have Mannual Testing class");
		
	}else if (day.equals("Thursday")) {
		System.out.println("I have Rivew class");
		
	}else if (day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("I have Java class");
	}
		
		Scanner input=new Scanner(System.in);
		   boolean eligibility=true;
		   int num=input.nextInt();

		   if (num<600){
		     System.out.println("Not eligible");
		     }else if (num==600 && num==700){
		       System.out.println("Maybe eligible");
		       }else if (num==701 && num==800){
		     System.out.println("Eligible");
		     }else if (num>800);
		     System.out.println("Definitely");
		     }
		

	}

}
