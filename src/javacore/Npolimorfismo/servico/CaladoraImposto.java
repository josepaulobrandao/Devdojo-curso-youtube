package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class CaladoraImposto {
	
//	public static void calcularImpostoComputador(Computador computador) {
//		System.out.println("Relatorio de imposto do computador...");
//		double imposto = computador.calcularImposto();
//		System.out.println("Imposto do computador: " + computador.getNome());
//		System.out.println("Valor do imposto do computador: " + computador.getValor());
//	}
//
//	public static void calcularImpostoTomate(Tomate tomate) {
//		System.out.println("Relatorio de imposto do tomate...");
//		double imposto = tomate.calcularImposto();
//		System.out.println("Imposto do computador: " + tomate.getNome());
//		System.out.println("Valor do imposto do tomate: " + tomate.getValor());
//	}
//	
	public static void calcularImposto(Produto produto) {
		System.out.println("Relat�rio de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Pre�o: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(((Tomate) produto).getDataValidade());
		}
		/*
	        * A convers�o de tipo em Java � usada para converter objetos ou vari�veis de um tipo em outro.
	        * Quando estamos convertendo ou atribuindo um tipo de dados a outro, eles podem n�o ser compat�veis.
	        * Se for adequado, funcionar� sem problemas, caso contr�rio, haver� chances de perda de dados.
	        *
	        * Tipos de convers�o de tipos em Java
	        *   O Java Type Casting � classificado em dois tipos.
	        *       - Widening cast (�mplicito) - convers�o autom�tica de tipo
	        *       - Narrowing cast (explicito) - precisa de convers�o explicita
	        *
	        * Widening Cast (menor para o maior tipo): Pode ocorrer se os dois tipos forem compat�veis e o tipo
	        * destino for maior que o tipo origem
	        * ex.:
	        * byte source = 40;
	        * short target = source; (n�o precisa de casting pra short)
	        *
	        * Widening Cast (Tipo de classe): No exemplo abaixo, a classe Computer e Tomato s�o os tipos menores
	        * que estamos atribuindo ao tipo de classe Product, que � um tipo maior, portanto,
	        * nenhuma convers�o � necess�ria.
	        *
	        * Narrowing Cast (maior para o menor tipo): Quando estamos atribuindo um tipo maior a um tipo menor,
	        * a convers�o explicita � necess�ria.
	        * ex.:
	        * double source = 30.0;
	        * float target = (float) source; (precisa do casting expl�cito pra float)
	        *
	        * Narrowing Cast (Tipo de classe): Quando estamos atribuindo um tipo maior a um tipo menor,
	        * precisamos convert� -lo explicitamente.
	        * ex.:
	        * Product product = new Computer();
	        * Computer computer = (computer) product;
	        * System.out.println(computer.getName());
	        * */
	}
}
