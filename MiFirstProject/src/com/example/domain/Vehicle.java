package com.example.domain;

public class Vehicle {
	private String make;
	private int milesPerGallon;
	
	public Vehicle() {
		make = "";
		milesPerGallon = 0;
	}
	
	public Vehicle(String make, int milesPerGallon) {
		this.make = make;
		this.milesPerGallon = milesPerGallon;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMilesPerGallon() {
		return milesPerGallon;
	}

	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	
	public void finalize() {
		System.out.println("Se destruye el vehículo");
	}
}
