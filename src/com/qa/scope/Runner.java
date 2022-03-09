package com.qa.scope;

public class Runner {

	public static void main(String[] args) {
		Scope myObj = new Scope();
		
		myObj.methodOne();
		myObj.methodTwo();
		myObj.methodTwo("ANOTHER MESSAGE");
		
		System.out.println();
	}
}
