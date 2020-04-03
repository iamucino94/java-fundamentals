package com.example.domain;

public class AccessExample {
	public int numero1 = 1;
	protected int numero2 = 2;
	int numero3 = 3;
	private int numero4 = 4;
	
	public boolean compare(AccessExample other) {
		return this.numero4 == other.numero4;
	}
}
