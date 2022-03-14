package com.qa.oop.inheritance;

public abstract class Animal {

	private int age;
	private int numOfLegs;
	private String colour;

	public Animal() {
	}

	public Animal(int age, int numOfLegs, String colour) {
		super();
		this.age = age;
		this.numOfLegs = numOfLegs;
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract void makeNoise();

	@Override
	public String toString() {
		return "Animal [age=" + age + ", numOfLegs=" + numOfLegs + ", colour=" + colour + "]";
	}

}
