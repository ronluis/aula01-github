package application;

import java.util.Locale;
import java.util.Scanner;
import entitiens.Triagulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// COM Orientação Objeto

		Triagulo x, y;
		x = new Triagulo();
		y = new Triagulo();

		System.out.println("Enter Triagulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter Triagulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		/*
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        */
		
		System.out.printf("A Área do Triangulo X é  %.4f%n", areaX);
		System.out.printf("A Área do Triangulo Y é  %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior Área e X: ");
		} else {
			System.out.println("Maior Área e Y: ");
		}

		/*
		 * SEM Orientação Objeto double xa, xb, xc, ya, yb, yc;
		 * 
		 * System.out.println("Enter Triagulo X: "); xa = sc.nextDouble(); xb =
		 * sc.nextDouble(); xc = sc.nextDouble();
		 * 
		 * System.out.println("Enter Triagulo Y: "); ya = sc.nextDouble(); yb =
		 * sc.nextDouble(); yc = sc.nextDouble();
		 * 
		 * double p = (xa + xb + xc) / 2.0; double areaX = Math.sqrt(p * (p - xa) * (p -
		 * xb) * (p - xc));
		 * 
		 * p = (ya + yb + yc) / 2.0; double areaY = Math.sqrt(p * (p - ya) * (p - yb) *
		 * (p - yc));
		 * 
		 * System.out.printf("A Área do Triangulo X é  %.4f%n", areaX);
		 * System.out.printf("A Área do Triangulo Y é  %.4f%n", areaY);
		 * 
		 * if(areaX>areaY){ System.out.println("Maior Área e X: "); } else {
		 * System.out.println("Maior Área e Y: "); }
		 * 
		 * 
		 */
		sc.close();

	}

}
