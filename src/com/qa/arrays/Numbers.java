package com.qa.arrays;

public class Numbers {

	public void method1 (int input) {
		int sum = 0;
		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		System.out.println(sum);
	}
	
	public String method2 (int input) {
			
		if (input <= 0) {
			System.out.println("ERROR: Zero & less not supported");
			return "";
		}
		
		if (input > 9999) {
			System.out.println("ERROR: Input must be less than 9999");
			return "";
		}
		
		String[] units = new String[] {
			"", " one", " two", " three", " four", " five", " six",
			" seven", " eight", " nine"
		};
		
		String[] teens = new String[] {
			" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen"
		};
		
		String [] tens = new String[] {
			"", "", " twenty", " thirty", " forty", " fifty",
		    " sixty", " seventy", " eighty", " ninety"
		};
		
		String [] thousandCatch = {"", " thousand"};
		
		String finalWord = "";
		int index = 0;
		
		do {
			int threeMax = input % 1000;
			if (threeMax != 0) {
				String word = "";
				int n = threeMax % 100;
				if (n < 10) {
					word = word + units[n];
				} else if (n < 20) {
					word = word + teens[n%10];
				} else {
					word = tens[n/10] + units[n%10];
				}
				String temp = (threeMax/100 > 0)? units[threeMax/100] + " hundred" + word : word;
				finalWord = temp + thousandCatch[index] + finalWord;
			}
			index++;
			input = input/1000;
		} while (input > 0);
		
		return finalWord;
	}
}
