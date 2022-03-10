package com.qa.conditionals;

public class Taxes {

	public int method1 (int salary) {
		if (salary < 0 || (salary >= 0 && salary <= 14999)) {
			return 0;
		} else if (salary >= 15000 && salary <= 19999) {
			return 10;
		} else if (salary >= 20000 && salary <= 29999) {
			return 15;
		} else if (salary >= 30000 && salary <= 44999) {
			return 20;
		} else {
			return 25;
		}
	}
	
	public int method2 (int salary) {
		if (salary < 0 || (salary >= 0 && salary <= 14999)) {
			return 0;
		} else if (salary >= 15000 && salary <= 19999) {
			return salary / 100 * 10;
		} else if (salary >= 20000 && salary <= 29999) {
			return salary / 100 * 15;
		} else if (salary >= 30000 && salary <= 44999) {
			return salary / 100 * 20;
		} else {
			return salary / 100 * 25;
		}		
	}
	
	public int method3 (int salary) {
		return (salary / 100) * method1(salary);
	}
}
