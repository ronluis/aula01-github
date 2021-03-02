package application;

import java.util.Locale;
import java.util.Scanner;

public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];
		double media = 0;

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
			media += vet[i];
		}
        
		System.out.printf("A media é %.2f", (media / n));
		
		sc.close();

	}

}
