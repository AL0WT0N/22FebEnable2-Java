package com.qa.oop.garageexercise.garage;

import java.util.ArrayList;

import com.qa.oop.garageexercise.vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.vehicles.remove(v)) {
			System.out.println("\n\nVehicle removed.");
		} else {
			System.out.println("\n\nVehicle not found.");
		}
	}
	
	
	public void removeVehicleById(int id) {
		Vehicle found = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == id) {
				found = vehicle;
			}
		}
		
		// We must remove here, not in the loop!
		removeVehicle(found);
	}
	
	public void removeByIdSuccess(int id) {
		Vehicle toBeDeleted = null;
		
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == id) {
				toBeDeleted = vehicle;
			}
		}
		
		// We must delete here!!
		if (vehicles.remove(toBeDeleted)) {
			System.out.println("Delete successful!!");
		} else {
			System.out.println("Vehicle not found!");
		}
	}
	
	public void removeVehiclesByType(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		
		for (Vehicle vehicle : vehicles) {
			
			if (vehicle.getClass().getSimpleName().equals(type)) {
				found.add(vehicle);
			}
//			
//			if (vehicle.getType() == type) {
//				found.add(vehicle);
//			}
		}
		
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
		}
	}
	
	public void emptyGarage() {
		System.out.println("\n\nVehicle(s) removed.");
		this.vehicles.clear();
	}
	
	public void getBillById(int id) {
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getId() == id) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println(String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", vehicle.getColour(), vehicle.getManufacturer(), id, vehicle.calculateBill()));
				break;
			}
		}
	}
	
	public void calculateIndividualBills() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println("--------------------------------------------------------------------------------------------");
			String output = String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", vehicle.getColour(), vehicle.getManufacturer(), vehicle.getId(), vehicle.calculateBill());
			System.out.println(output);
		}
	}
	
	public void calculateTotalBill() {
		double total = 0;
		for (Vehicle vehicle : this.vehicles) {
			total += vehicle.calculateBill();
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\nThe total bill for all vehicles in the garage is: £" + total);
	}
	
	public void printAll() {
		System.out.println("\n\n--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Full list of vehicles---------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
}
