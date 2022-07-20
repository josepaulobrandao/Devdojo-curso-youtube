package javacore.Gassociacao.dominio.unidirecionalmuitospramuitos;

public class Teste {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("José");
		Time time = new Time("Seleção africana");
		
		jogador1.setTime(time);/*Relacionamento*/
		jogador1.imprime();
	}
}
