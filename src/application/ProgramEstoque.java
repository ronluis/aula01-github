package application;

import java.util.Locale;
import java.util.Scanner;
import entitiens.Produto;

public class ProgramEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Qtde: ");
		int qtde = sc.nextInt();

		Produto p = new Produto(nome, preco, qtde);
		
		System.out.println();
		System.out.println("Dados do Produto: " + p);
		System.out.println();

		System.out.print("Entre Com Qtde à Acrescentar no Estoque: ");
		qtde = sc.nextInt();
		p.adicionsQtdeProduto(qtde);

		System.out.println();
		System.out.println("Dados Adicionados ao Produto: " + p);
		System.out.println();

		System.out.print("Entre Com Qtde à Acrescentar no Estoque: ");
		qtde = sc.nextInt();
		p.subtrairQtdeProduto(qtde);

		System.out.println();
		System.out.println("Dados Subtraidos do Produto: " + p);

		sc.close();
	}

}
