package com.qa.conditionals;

public class CalculatorRevisited {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static double div(int a, int b) {
		if (a >= b) {
			System.out.println("Cannot Perform Division. First input must be less than second");
			return 0;
		} else {
			double x = a;
			double y = b;
			return x / y;			
		}
	}
}
