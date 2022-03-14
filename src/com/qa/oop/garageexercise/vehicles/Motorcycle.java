package com.qa.oop.garageexercise.vehicles;

public class Motorcycle extends Vehicle {

	private int handleBarWidth;
	
	public Motorcycle(int id, String colour, String manufacturer, int numOfWheels, double price, int handleBarWidth) {
		super(id, "Motorcycle", colour, manufacturer, numOfWheels, price);
		this.handleBarWidth = handleBarWidth;
	}
	
	public void setHandleBarWidth(int handleBarWidth) {
		this.handleBarWidth = handleBarWidth;
	}
	
	public int getHandleBarWidth() {
		return this.handleBarWidth;
	}
	
	public void popWheelie() {
		System.out.println("I should probably never do this again...");
	}

	@Override
	public double calculateBill() {
		return this.getHandleBarWidth() * 39.99;
	}
}
