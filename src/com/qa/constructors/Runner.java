package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {

		// Static members can be accessed through the class itself
		// You don't need to make an object first!
		Person.sleep();
		
		Person anoush = new Person("Anoush", 28, 12);
		System.out.println("Name: " + anoush.name);
		System.out.println("Age: " + anoush.age);
		System.out.println("Shoe Size: " + anoush.shoeSize);
		anoush.eat();
		
		System.out.println();
		
		Person mateusz = new Person("Mateusz", 24, 10);
		System.out.println("Name: " + mateusz.name);
		System.out.println("Age: " + mateusz.age);
		System.out.println("Shoe Size: " + mateusz.shoeSize);
		mateusz.eat();
		
		System.out.println();
		
		// This constructor will use default values
		Person p = new Person();
		System.out.println("Name: " + p.name);
		System.out.println("Age: " + p.age);
		System.out.println("Shoe Size: " + p.shoeSize);
		p.eat();
	}
}
