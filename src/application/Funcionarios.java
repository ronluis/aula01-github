package application;

import java.util.Locale;
import java.util.Scanner;

import entitiens.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Quantos funcionairos registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + 1 + ":");
			System.out.print("id: ");
			Integer id = sc.nextInt();
			while (existeId(list, id)) {
				System.out.println("Id já Digitado");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();

			Funcionario obj = new Funcionario(id, nome, salario);

			list.add(obj);

		}

		System.out.println();
		System.out.println("Qual funcionario tera aumento: ");
		int idAumento = sc.nextInt();
		
		//int pos = posId(list, idAumento);
		Funcionario pos = list.stream().filter(obj -> obj.getId() == idAumento).findFirst().orElse(null);
		
		if (pos == null) {
			System.out.println("Id do Funcionario não encontrado!");
		} else {
			System.out.println("% de Aunmento? ");
			double perc = sc.nextDouble();
			pos.aumentarSalario(perc);
		}

		System.out.println();
		System.out.println("Lista de Funcionarios");

		for (Funcionario fun : list) {
			System.out.println(fun);
		}

		sc.close();
	}

	public static Integer posId(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean existeId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}