package com.qa.strings;

public class RunnerDemo {

	public static void main(String[] args) {

//		String myString = "Message";
//		String anotherString = "Message";
//		
//		if (myString == anotherString) {
//			System.out.println("SUCCESS!!");
//		}
		
		// Two different objects!
		String myString = new String("Message");
		String anotherString = new String("Message");
		
		// Are these objects the same?
		if (myString == anotherString) {
			System.out.println("SUCCESS!!");
		}
		
		// Is the value of the strings the same?
		if (myString.equals(anotherString)) {
			System.out.println("SUCCESS!!");
		}
		
		// Get the length of the string!
		System.out.println(myString.length());
		
		String thirdString = myString + " " + anotherString;
		System.out.println(thirdString);
		
		String fourthString = myString.concat(" ").concat(anotherString);
		System.out.println(fourthString);
		
		Integer num = 10;
		String fifthString = fourthString + " " + num;
		System.out.println(fifthString);
		
		// String manipulation methods
		
		// Substring - extract strings from within other strings.
		System.out.println(thirdString.substring(5, 9));
		
		// Change Case
		System.out.println(thirdString.toUpperCase());
		System.out.println(thirdString.toLowerCase());
		
		// Get the character at a specific index
		System.out.println(thirdString.charAt(1));
		
		// Get the position/index of a specific character
		System.out.println(thirdString.indexOf('e'));
		
		// Starts with
		System.out.println(thirdString.startsWith("M"));
		
		// Replace
		System.out.println(thirdString.replace("Mes", "MES"));
	}
}
