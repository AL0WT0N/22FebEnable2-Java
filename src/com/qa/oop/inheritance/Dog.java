package com.qa.oop.inheritance;

public class Dog extends Animal{
	
	private String breed;
	private boolean isPanting;
	
	public Dog(int age, int numOfLegs, String colour, String breed, boolean isPanting) {
		// You can use the super constructor
//		super(age, numOfLegs, colour);
		// Or you can use the setter methods inherited from the parent
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
		
		// Here you set the Dog's exclusive properties
		this.breed = breed;
		this.isPanting = isPanting;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}

	@Override
	public void makeNoise() {
		System.out.println("BARK!!!!!!");
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + this.getAge() + ", numOfLegs=" + this.getNumOfLegs() + ", colour=" + this.getColour() 
			+ " breed = " + breed + " isPanting = " + isPanting + "]";
	}
	
}
