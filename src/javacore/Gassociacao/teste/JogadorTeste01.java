package javacore.Gassociacao.teste;

import javacore.Eblocoinicializacao.dominio.Jogador;

public class JogadorTeste01 {
	public static void main(String[] args) {
		
		
		Jogador jogador1 = new Jogador("Pele");
		Jogador jogador2 = new Jogador("Romario");
		Jogador jogador3 = new Jogador("Caful");
		int[] value = new int[] {1,2,3,4};
		Jogador[] jogadores = {jogador1,jogador2,jogador3};
	
		int[][] linha = new int[3][3];
		
		
		//Foreach multidimensional
		for(int[] linhas : linha) {
			System.out.println(linhas);
			for(int colunas : value) {
				System.out.println(colunas);
			}
		}
		
		for (int values : value) {
			System.out.println(values);
		}
		
		for (Jogador jogador : jogadores) {
			jogador.imprimi();
		}
		
	}
}
