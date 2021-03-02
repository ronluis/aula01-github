package application;

import java.util.Locale;
import java.util.Scanner;

import entitiens.Conta;


public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Conta conta;
		
		System.out.print("Entre com o Número da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o Nome do Cliente: ");
		sc.nextLine();
		String cliente  = sc.nextLine();
		System.out.print("Fez deposito Inicial (s/n)?: ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Entre com o Valor do Deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, cliente, depositoInicial); 
		} else {
			conta = new Conta(numero, cliente);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Valor do Deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Novos Valores com o Deposito");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Valor do Saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Novos Valores com o Saque");
		System.out.println(conta);
		
		sc.close();
	}

}
