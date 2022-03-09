package com.qa.constructors;

public class Person {

	public String name;
	public int age;
	public int shoeSize;
	
	public Person() {}
	
	public Person(int age, int shoeSize) {
		this.age = age;
		this.shoeSize = shoeSize;
	}
	
	public Person(String name, int age, int shoeSize) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}
	
	public void eat() {
		System.out.println("I'm eating!!!!");
	}
	
	public static void sleep() {
		System.out.println("I'm sleeping!!!!");
	}
}
