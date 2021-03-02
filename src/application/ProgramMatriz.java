package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		// **Onde l = Linha e c = Coluna na matriz bidimensional.
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.println("Matriz Diagonal");
		for (int l = 0; l < n; l++) {
			System.out.print(mat[l][l] + " ");
		}
		
		int cont = 0;
		
		System.out.println();
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				if (mat[l][c] < 0) {
					cont++;
				}
			}
		}
		
		System.out.printf("Qt números Negativos: " + cont);
		
		// qtde de linha
		// mat.length
		
		// qtde de colunas onde l=linhas
		//mat[l].length
		
		sc.close();
	}

}
