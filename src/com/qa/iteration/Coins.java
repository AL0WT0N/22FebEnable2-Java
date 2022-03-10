package com.qa.iteration;

public class Coins {
	
	public void calcChange(double cost, double amount) {
		double change = amount - cost;
		int tweNote = 0;
		int tenNote = 0;
		int fivNote = 0;
		int twoPound = 0;
		int onePound = 0;
		int fifPence = 0;
		int twePence = 0;
		int tenPence = 0;
		int fivPence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		while (change >= 20) {
			change -= 20;
			tweNote++;
		}
		
		if (tweNote != 0) {
			System.out.println(tweNote + " £20 notes");
		}
	
		while (change >= 10) {
			change -= 10;
			tenNote++;
		}
		
		if (tenNote != 0) {
			System.out.println(tenNote + " £10 notes");
		}
		
		while (change >= 5) {
			change -= 5;
			fivNote ++;
		}
		
		if (fivNote != 0) {
			System.out.println(fivNote + " £5 notes");
		}
		
		while (change >= 2) {
			change -= 2;
			twoPound++;
		}
		
		if (twoPound != 0) {
			System.out.println(twoPound + " £2 coins");
		}
		
		while (change >= 1) {
			change -= 1;
			onePound++;
		}
		
		if (onePound != 0) {
			System.out.println(onePound + " £1 coins");
		}
		
		while (change >= 0.5) {
			change -= 0.5;
			fifPence++;
		}
		
		if (fifPence != 0) {
			System.out.println(fifPence + " 50p coins");
		}
		
		while (change >= 0.2) {
			change -= 0.2;
			twePence++;		
		}
		
		if (twePence != 0) {
			System.out.println(twePence + " 20p coins");
		}
		
		while (change >= 0.1) {
			change -= 0.1;
			tenPence++;
		}
		
		if (tenPence != 0) {
			System.out.println(tenPence + " 10p coins");
		}
		
		while (change >= 0.05) {
			change -= 0.05;
			fivPence++;
		}
		
		if (fivPence != 0) {
			System.out.println(fivPence + " 5p coins");
		}
		
		while (change >= 0.019) {
			change -= 0.019;
			twoPence++;
		}
		
		if (twoPence != 0) {
			System.out.println(twoPence + " 2p coins");
		}
		
		while (change >= 0.009) {
			change -= 0.009;
			onePence++;
		}
		
		if (onePence != 0) {
			System.out.println(onePence + " 1p coins");
		}
	}
}
