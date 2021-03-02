package application;

import java.util.Locale;
import java.util.Scanner;

import entitiens.Array02_Class;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		Array02_Class[] vet = new Array02_Class[n];
		
		double media = 0;
		
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String descricao = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new Array02_Class(descricao, preco);
            media += vet[i].getPreco();
		}

		System.out.printf("A media é %.2f", (media / vet.length));
		
		sc.close();
	}

}
