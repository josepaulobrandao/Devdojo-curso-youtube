package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
	public static void main(String[] args) {
		
		Produto produto = new Computador("NU103", 10000);

		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		System.out.println("-------------------");
		
		Produto produto2 = new Tomate("Tomate ameriano", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
		
	}
}
