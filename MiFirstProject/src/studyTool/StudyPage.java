package studyTool;

import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {
		//Definimos un objeto de la clase Scanner para poder recibir información
		Scanner scanterm = new Scanner(System.in);
	
		double gallons = scanterm.nextDouble();
		double liters = gallons * 3.785;
		System.out.println("Litros: "+ liters);
	}

}
