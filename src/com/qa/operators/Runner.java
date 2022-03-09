package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(5, 5));
		System.out.println(c.sub(5, 5));
		System.out.println(c.mul(5, 5));
		System.out.println(c.div(5, 5));
	
	}
}
