package javacore.Lclassesabstratas.teste;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Nami", 5000);
		System.out.println(gerente);
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 1500);
		System.out.println(desenvolvedor);
		
		gerente.imprime();
		desenvolvedor.imprime();
		
	}
	
	
	

}
