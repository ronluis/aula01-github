package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class ProgramEstatico {
	//public static final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Calcular calc = new Calcular();
		
		System.out.print("Entre Com Valor do Raio: ");
		double raio = sc.nextDouble();

		double c = calc.Circunferencia(raio);
		double v = calc.Volume(raio);

		System.out.printf("A Circunferencia  %.2f%n", c);
		System.out.printf("O Volume é  %.2f%n", v);
		System.out.printf("O Valor de PI é %.2f%n", calc.PI);

		sc.close();

	}
/*
	public static double Circunferencia(double raio) {
		return 2 * PI * raio;
	}

	public static double Volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
*/
}
