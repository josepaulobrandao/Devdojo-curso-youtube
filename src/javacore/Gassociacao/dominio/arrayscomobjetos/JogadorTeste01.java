package javacore.Gassociacao.dominio.arrayscomobjetos;

public class JogadorTeste01 {
	public static void main(String[] args) {

		/* 64 - Orienta��o Objetos - Associa��o pt 01 - Arrays com Objetos */
		Jogador jogador1 = new Jogador("Pel�");
		Jogador jogador2 = new Jogador("Cr7");
		Jogador jogador3 = new Jogador("Messi");

		Jogador[] jogadores = new Jogador[] { jogador1, jogador2, jogador3 };

		for (Jogador jogador : jogadores) {
			jogador.impmrime();
		}

	}

}
