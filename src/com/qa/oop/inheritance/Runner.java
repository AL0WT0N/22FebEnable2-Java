package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Dog bob = new Dog(15, 4, "black", "Staffy", false);
		Cat cat = new Cat();
		
		// Dog is a Dog
		// Dog is an Animal
		// Dog is an Object
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(bob);
		listOfAnimals.add(cat);
		
		
		
	}
}
