package javacore.Jmodificadorfinal.teste;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Comprador;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
	public static void main(String[] args) {
		
		Carro carro = new Carro();

		Comprador comprador2 = new Comprador();
		
		System.out.println(Carro.VELOCIDADE_LIMITE);
		//System.out.println(carro.VELOCIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);
		
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("BWF-469");
		ferrari.imprime();
		
	}
}
