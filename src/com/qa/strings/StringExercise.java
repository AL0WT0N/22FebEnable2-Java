package com.qa.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringExercise {

	// Task 1
	public String one = "yesterday it was raining";
	public String two = "today it is sunny";
	public String firstOutput = two.toUpperCase() + ", " + one.toUpperCase();

	// Task 2
	public String sub1 = two.substring(0, 11);
	public String sub2 = one.substring(16, 24);
	public String secondOutput = (sub1 + sub2).toUpperCase();

	// Assumes friendly input
	public String[] easyMethodOne(String x) {
		String word = x.strip();
		String[] words = word.split(" ");
		return words;
	}
	
	// Assumes friendly input
	public void method1(String x) {
		int words = 0;
		String input = x.strip();

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(" ") || i == (input.length() - 1)) {
				words++;
			}
		}

		System.out.println("Words: " + words);
	}

	// More robust against difficult inputs
	public void methodOne(String x) {
		int wordCount = 0;
		String input = x.strip();
	
		for (int i = 0; i < input.length(); i++) {
			char thisChar = input.charAt(i);
			char nextChar = (i + 1 < input.length())? input.charAt(i + 1) : 0;
			
			// Ensure this character isn't the final, and the next one isn't a space.
			if (thisChar == ' ' && nextChar != 0 && nextChar != ' ') {
				wordCount++;
			}
			
			// Case for last word
			if (nextChar == 0) {
				wordCount++;
			}
		}
		
		System.out.println("Words: " + wordCount);
	}
	
	// Assumes friendly input
	public void easyMethodTwo(String x) {
		String[] words = easyMethodOne(x);
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	// Assumes friendly input
    public void methodTwo(String x) {
    	String input = x.strip();
		String output = input.replace(' ', '\n');
		System.out.println(output);
    }
	
	public void method2(String x) {
		String input = x.strip();
		int space = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(" ") || i == (input.length() - 1)) {
				System.out.println(input.substring(space, i + 1));
				space = i + 1;
			}
		}
	}

	public void easyMethodThree(String x) {
		String[] words = easyMethodOne(x);
		List<String> wordsList = Arrays.asList(words);
		Collections.reverse(wordsList);
		
		for (String word : wordsList) {
			System.out.println(word);
		}
	}
	
	public void method3(String x) {
		char[] inputArr = x.toCharArray();
		char[] reversedInput = new char[inputArr.length];
		int forwardIndex = 0;

		for (int i = inputArr.length - 1; i >= 0; i--) {
			reversedInput[forwardIndex] = inputArr[i];
			forwardIndex++;
		}

		method2(String.valueOf(reversedInput));
	}

    public void methodThree(String input) {
        int space = input.length();
        
        for (int i = input.length(); i > 0; i--) {
        	
            if (input.substring(i - 1, i).equals(" ")) {
                System.out.println(input.substring(i, space));
                space = i;
            } else if (i == 1) { 
                System.out.println(input.substring(i - 1, space));
            }
        }
    }
	
	public boolean method4(String message, String find) {
//		System.out.println(message.contains(find));
		boolean found = false;
		int range = message.length() - find.length();

		for (int i = 0; i < range; i++) {

			if (message.substring(i, i + find.length()).equals(find) 
					|| message.substring(i + 1, i + find.length() + 1).equals(find)) {
				found = true;
			}

		}

		System.out.println("Substring present? " + found);
		return found;
	}
}
