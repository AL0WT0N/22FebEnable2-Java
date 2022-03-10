package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// Create a new arraylist
		List<String> listOfStrings = new ArrayList<>();
		
		// Returns an unmodifiable aka immutable list
//		List<String> listOfStrings = List.of("Hello", "There");

		// Returns a regular list
//		List<String> listOfStrings = Arrays.asList("Hello", "There");
		
		// How to add to the array list
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
		// How we get values out of the array list
		System.out.println(listOfStrings.get(1));
		
		// Change a value at a specified index in the array list
		listOfStrings.set(0, "Hi");
		System.out.println(listOfStrings.get(0));
		
		// Remove element from the list based on index position
//		listOfStrings.remove(1);
//		System.out.println(listOfStrings);
		
		// Get the length of the array list
		System.out.println("The Length is: " + listOfStrings.size());
		
		// Clear the array list (remove all values)
//		listOfStrings.clear();
//		System.out.println(listOfStrings.size());
//		System.out.println(listOfStrings);
		
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
		System.out.println();
		
		for (String x : listOfStrings) {
			System.out.println(x);
		}
		
		// Gives us the index position of an element, if it's there.
		System.out.println(listOfStrings.indexOf("Hi"));
		
		listOfStrings.contains("Hi");
	}
}
