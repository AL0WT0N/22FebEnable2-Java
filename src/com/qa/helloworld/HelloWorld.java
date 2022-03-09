package com.qa.helloworld;

public class HelloWorld {
	// accessmodifier ReturnType
	public void helloWorld() {
		// Datatype variableName = value;
		String helloWorld = "Hello World\nThis is more text";
		System.out.println(helloWorld);
	}
	
	public void printMessage(String messageOne, String messageTwo, int number) {
		System.out.println(messageOne);
		System.out.println(messageTwo);
		System.out.println(number);
	}
	
	public String concatText(String x, String y) {
		return x + " " + y;
	}
}
