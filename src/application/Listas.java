package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Joao");
		list.add("Luis");
		list.add("Aline");
		list.add("Ana");
		list.add("Lara");
		list.add("Roberta");
		list.add("Ronaldo");
		list.add(2, "Vivili");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------------------");

		list.remove("Roberta");
		list.remove(1);
		
		list.removeIf(obj -> obj.charAt(0) == 'R');
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------------");
		System.out.println("Onde Esta Você Lara -> " + list.indexOf("Lara"));
		System.out.println("Onde Esta Você Pedro -> " + list.indexOf("Pedro")); // Quando não está na lista e retornado o -1 <<<<
		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList());
		for (String obj : result) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		String name = list.stream().filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}