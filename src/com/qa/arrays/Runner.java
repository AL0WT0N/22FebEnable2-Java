package com.qa.arrays;

public class Runner {

	public static void main (String[] args) {
		
		Numbers n = new Numbers();
		
		for (int i = 1; i <= 999; i++) {
			System.out.println(n.method2(i));
		}
	}
}
