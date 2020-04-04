package com.example.domain;

public class PrivateConstructor {
	
	private PrivateConstructor(/*muchos argumentos requeridos*/) {
		/*
		 * Lógica complicada
		 */
	}
	
	public static PrivateConstructor getInstance() {
		/**
		 * Lógica complicada de instancia
		 */
		PrivateConstructor temp = new PrivateConstructor(/*muchos argumentos*/);
		return temp;
	}

	public static void main(String[] args) {
		//llamada desde otra clase
		PrivateConstructor obj = PrivateConstructor.getInstance();
	}

}
