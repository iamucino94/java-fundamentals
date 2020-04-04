package com.example.domain;

public class StaticExample {
	public static String variable1 = "Hola";
	public String variable2;
	
	public StaticExample(String variable2) {
		this.variable2 = variable2;
	}
	
	public static void message() {
		System.out.println(variable1);
//		System.out.println(variable2);
	}
	
	public void message2() {
		System.out.println(variable1);
		System.out.println(variable2);
	}
	
	public static void main(String[] args) {
		System.out.println(StaticExample.variable1);
		StaticExample ejemplo = new StaticExample(" mundo");
		System.out.println(ejemplo.variable2);
		System.out.println(ejemplo.variable1);
		
		StaticExample.message();
		ejemplo.message2();
	}
}
