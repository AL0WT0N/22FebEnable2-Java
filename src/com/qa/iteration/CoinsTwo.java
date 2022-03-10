package com.qa.iteration;

public class CoinsTwo {
	public void calcChange(double cost, double amount) {
		
        double changeInPence = (amount - cost) * 100;
        double numberOfTens = (changeInPence/1000);
        double numberOfFives = ((changeInPence%1000)/500);
        double numberOfTwentyp = (((changeInPence%1000)%500)/20);
        double numberOfTwop = ((((changeInPence%1000)%500)%20)/2);
        double numberOfOnep = (((((changeInPence%1000)%500)%20)%2)/1);
        
        System.out.println((int) (numberOfTens) + " £10 note");
        System.out.println((int) (numberOfFives) + " £5 note");
        System.out.println((int) (numberOfTwentyp) + " 20p");
        System.out.println((int) (numberOfTwop) + " 2p");   
        System.out.println((int) (numberOfOnep) + " 1p");   
    }
}
