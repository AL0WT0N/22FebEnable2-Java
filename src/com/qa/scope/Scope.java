package com.qa.scope;

public class Scope {

	// This is class level scope (instance scope)
	public String message = "hello";
	
	public void methodOne() {
		// This is local scope (method scope)
		String message = "Goodbye";
		System.out.println(message);
	}
	
	public void methodTwo() {
		System.out.println(message);
	}
	
	// Method overloading
	public void methodTwo(String message) {
		System.out.println(message);
	}
}
