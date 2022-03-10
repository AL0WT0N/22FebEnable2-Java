package com.qa.conditionals;

public class UniqueSum {
	
	public int input (int a, int b, int c) {
		if (a == b && a == c) {
			return 0;
		} else if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a + b + c;
		}
	}
}
