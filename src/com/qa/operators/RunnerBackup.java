package com.qa.operators;

public class RunnerBackup {
	
	public static void main(String[] args) {
		int numOne = 9;
		int numTwo = 10;
		
//		System.out.println(numOne + numTwo);
//		System.out.println(numOne - numTwo);
//		System.out.println(numOne * numTwo);
//		System.out.println((float)numOne / (float)numTwo);
		
		// Modulus
//		System.out.println(10 % 2); // 5 remainder 0
//		System.out.println(10 % 3); // 3 remainder 1
		
		//Unary
		System.out.println(++numOne); //Increment first, then print
		System.out.println(numOne++); //Print first, then increment
		
		numOne += numOne;
		numOne = numOne + numOne;
		
		numOne += 1;
		numOne = numOne + 1;
		
		System.out.println(numOne);	
		
		//Not operator
		boolean flag = false;
		System.out.println(!flag);

	}
}
