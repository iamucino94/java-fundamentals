package com.example.domain;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Ford", 5);
		
		System.out.println(v1.getMake() + " " + v1.getMilesPerGallon());
		System.out.println(v2.getMake() + " " + v2.getMilesPerGallon());
		
		v1 = v2;
		
		System.out.println(v1.getMake() + " " + v1.getMilesPerGallon());
		System.out.println(v2.getMake() + " " + v2.getMilesPerGallon());
		
		while(true) {
			int a = 1;
			String b = "Prueba de string";
		}
	}

}
