package javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList(16); //até a versão 1.4;
		List<String> nomes2 = new ArrayList(16);
		nomes.add("Jose");
		nomes.add("Devdojo");
		nomes2.add("Suane");
		nomes2.add("Academy");

		nomes.addAll(nomes2);

		for (String nome : nomes) {
			System.out.println(nome);
		}
		int size = nomes.size();
		for (int i = 0; i < size; i++){
			nomes.add("suane");
			System.out.println(nomes.get(i));
		}
		System.out.println(nomes);
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);


	}
}
