package com.qa.operators;

public class Results {

	public int physicsResult;
	public int chemResult;
	public int bioResult;
	public int total;
	public int percentage;
	
	public Results(int physicsResult, int chemResult, int bioResult) {
		this.physicsResult = physicsResult;
		this.chemResult = chemResult;
		this.bioResult = bioResult;
		this.total = physicsResult + chemResult + bioResult;
		// Could calculate percentage here :)
	}
	
	public void methodOne() {
		System.out.println("------------------\nYour results are:\n------------------");
		System.out.println("Physics:      " + this.physicsResult);
		System.out.println("Chemistry:    " + this.chemResult);
		System.out.println("Biology:      " + this.bioResult);
		System.out.println("Total Result: " + this.total + "\n------------------");
	}
	
	public void methodTwo() {
		this.percentage = (total * 100) / 450;
		System.out.println("Percentage: " + this.percentage + " %\n"); 	
	}
	
}
