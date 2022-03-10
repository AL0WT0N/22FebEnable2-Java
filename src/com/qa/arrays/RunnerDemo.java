package com.qa.arrays;

public class RunnerDemo {

	public static void main(String[] args) {
		
		// 3 ways to make a basic array
		int[] numArray;
		
		
		int[] anotherNumArray = {10, 23, 45, 76, 87};
		
		// This array has 5 index positions. 0-4.
		int[] finalArray = new int[5];
		finalArray[3] = 1;
		
		// Making a multi-dimensional array
		int[][] mDArray;
		
		
		// how to assign values in an array
//		finalArray[0] = 10;
//		finalArray[1] = 15;
//		finalArray[2] = 20;
//		finalArray[3] = 30;
//		finalArray[4] = 40;
		
//		System.out.println(finalArray.length);

//		for(int i = 0; i < finalArray.length; i++) {
//			finalArray[i] = 10;	
//		}
//		
		for(int i = 0; i < finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}
		
//		for(int x : finalArray) {
//			System.out.println(x);
//		}
		
		// Multi-dimensional array
		int[][] anotherMDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0; i < anotherMDArray.length; i++) {
			for (int j = 0; j < anotherMDArray[i].length; j++) {
				System.out.print(anotherMDArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
