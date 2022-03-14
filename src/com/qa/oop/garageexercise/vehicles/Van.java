package com.qa.oop.garageexercise.vehicles;

public class Van extends Vehicle{

	private int storageSpace;
	
	public Van(int id, String colour, String manufacturer, int numOfWheels, double price, int storageSpace) {
		super(id, "Van", colour, manufacturer, numOfWheels, price);
		this.storageSpace = storageSpace;
	}
	
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	
	public int getStorageSpace() {
		return this.storageSpace;
	}

	@Override
	public double calculateBill() {
		double vModifier = this.getStorageSpace() / 100;
		return 99.99 * vModifier;
	}
}
