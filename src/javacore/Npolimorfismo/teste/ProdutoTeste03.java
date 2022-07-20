package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CaladoraImposto;

public class ProdutoTeste03 {
	public static void main(String[] args) {
		
		Produto produto = new Computador("NU103", 10000);

		Tomate  tomate = new Tomate("Tomate ameriano", 20);
		tomate.setDataValidade("11/12/2021");
		
		CaladoraImposto.calcularImposto(tomate);
		System.out.println("-------------");
		CaladoraImposto.calcularImposto(produto);
		
	}
}
