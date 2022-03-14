package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerTemp {

	public static void main(String[] args) {
		// Sorting
		List<String> myList = new ArrayList<>();
		myList.add("Bat");
		myList.add("Cat");
		myList.add("Ant");
		System.out.println("Original order:          " + myList);
		
		Collections.sort(myList);
		System.out.println("Sorted order:            " + myList);
		
		Collections.sort(myList, Collections.reverseOrder());
	}
	
}
