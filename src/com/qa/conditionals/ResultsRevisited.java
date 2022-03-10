package com.qa.conditionals;

public class ResultsRevisited {

	public int physicsResult;
	public int chemResult;
	public int bioResult;
	public int total;
	public int percentage;
	
	public ResultsRevisited(int physicsResult, int chemResult, int bioResult) {
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
	
	public void showPercentage() {
		double overallPercent = (total * 100) / 450;
		double physPercent = (physicsResult * 100) / 150;
		double chemPercent = (chemResult * 100) / 150;
		double bioPercent = (bioResult * 100) / 150;
		
		System.out.println("Percentage: " + overallPercent + " %\n");
		
		if (overallPercent >= 60 && physPercent >= 60 && chemPercent >= 60 && bioPercent >= 60) {
			System.out.println("\nResult: PASS");
		} else {
			
			if (physPercent < 60) {
				System.out.println("Physics: FAIL");
			}
			
			if (chemPercent < 60) {
				System.out.println("Chemistry: FAIL");
			}
			
			if (bioPercent < 60) {
				System.out.println("Biology: FAIL");
			}

			System.out.println("\nOverall Result: FAIL");
		}
	}
}
