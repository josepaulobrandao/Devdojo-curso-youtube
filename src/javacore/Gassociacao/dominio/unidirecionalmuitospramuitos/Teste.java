package javacore.Gassociacao.dominio.unidirecionalmuitospramuitos;

public class Teste {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Jos�");
		Time time = new Time("Sele��o africana");
		
		jogador1.setTime(time);/*Relacionamento*/
		jogador1.imprime();
	}
}
