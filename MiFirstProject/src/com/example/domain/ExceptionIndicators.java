package com.example.domain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionIndicators {
	public static void main(String[] args)  {
//		int[] example = {1, 2, 3};
//		example[3] = 0;
//		String[] s1 = new String[5];
//		s1[0] = "a";
//		System.out.println(s1[0]);
//		System.out.println(s1[0].charAt(0));
		
//		FileReader reader = new FileReader("test.txt");
		try {
			//throw new Exception("Excepcion de prueba");
			System.out.println("Dentro del try");
		}
		catch(Exception e) {
			//mala práctica
		}
		finally {
			System.out.println("Siempre se ejecuta");
		}
	}
}
