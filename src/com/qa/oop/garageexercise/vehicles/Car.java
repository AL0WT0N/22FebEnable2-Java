package com.qa.oop.garageexercise.vehicles;

public class Car extends Vehicle {

	private boolean hasSunRoof;
	private int numOfDoors;
	
	public Car(int id, String colour, String manufacturer, int numOfWheels, double price, int numOfDoors, boolean hasSunRoof) {
		super(id, "Car", colour, manufacturer, numOfWheels, price);
		this.numOfDoors = numOfDoors;
		this.hasSunRoof = hasSunRoof;	
	}
	
	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}
	
	public boolean getHasSunRoof() {
		return this.hasSunRoof;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	public int getNumOfDoors() {
		return this.numOfDoors;
	}

	@Override
	public double calculateBill() {
		double cModifier = this.getNumOfDoors() * 10;
		return 49.99 * cModifier;
	}
}
