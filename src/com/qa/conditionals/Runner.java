package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		
		int num = 3;
		int num2 = 5;
		
		// ONLY ONE of the conditions needs to be true
		if (num == 3 || num2 == 10) {
			System.out.println("Condition met"); // This is ran
		} else { 
			System.out.println("Condition not met");
		}
		
		// BOTH of the conditions need to be true
		if (num == 3 && num2 == 10) {
			System.out.println("Condition met");
		} else { 
			System.out.println("Condition not met"); // This is ran
		}

		// Switch/Case
		switch(num) {
			case 0:
				System.out.println("Number is 1");
				break;
			case 1:
				System.out.println("Number is 2");
				break;
			case 2:
				System.out.println("Number is 3");
				break;
			case 3:
				System.out.println("Number is 3");
				break;
			case 4:
				System.out.println("Number is 3");
				break;
			default:
				System.out.println("Number is something else");
				break;
		}	
	}
}
