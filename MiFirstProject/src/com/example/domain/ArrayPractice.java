package com.example.domain;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String args[]) {
		for(String temp : args) {
			System.out.println(temp);
		}
//		String[] myBouquet= {"Rose", "Sunflower", "Daisy", "Dandelion",   "Violet", "Lily"};
////		for(int i = 0; i < myBouquet.length; i++) {
////			System.out.println(myBouquet[i]);
////		}
//		for(String myFlower : myBouquet) {
//			System.out.println(myFlower);
//		}
//		
//		String[][] myBouquetColors = {{"Red", "Peach", "Yellow"}, 
//				{"Yellow", "White", "Blue"}, 
//				{"Green", "Blue", "Purple"}, 
//				{"White", "White", "White"}, 
//				{"Purple", "Pink", "Violet"}, 
//				{"Pink", "Orange", "White"}};
//		String rose1 = myBouquetColors[0][0];
	}
	
	public static void array2d() {
		Scanner in = new Scanner(System.in);
		int[][] nums = new int[3][2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.println("Ingresa un valor para la fila " + i + ", columna "+ j);
				nums[i][j] = in.nextInt();
			}
		}
		System.out.println("");
	}
}
