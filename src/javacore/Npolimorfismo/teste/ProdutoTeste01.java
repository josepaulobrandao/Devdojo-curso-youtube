package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CaladoraImposto;

public class ProdutoTeste01 {
	public static void main(String[] args) {
		
		Computador computador = new Computador("NU103", 10000);
		Tomate tomate = new Tomate("Tomate sciciliano", 10);
		Televisao tv = new Televisao("Samsung 50\" ", 5000);
		
		
		CaladoraImposto.calcularImposto(computador);
		System.out.println("-----------");
		CaladoraImposto.calcularImposto(tomate);
		System.out.println("-----------");
		CaladoraImposto.calcularImposto(tv);
		
		
	}
}
