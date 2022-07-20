package javacore.Gassociacao.dominio.bidirecional;

public class Teste {
	public static void main(String[] args) {
	
		Jogador jogador = new Jogador("Cristiano ronaldo");
		Jogador jogador2 = new Jogador("Messi");
		Time time = new Time("Portugal");
		Time time2 = new Time("Argentina");
		Jogador[] jogadores = {jogador,jogador2};
		
		
		jogador.setTime(time);
		jogador2.setTime(time2);
		time.setJogadores(jogadores);
		
		System.out.println("------jogador------");
		
		jogador.imprime();
		jogador2.imprime();
		
		System.out.println("------Time------");
		
		time.imprime();
		time2.imprime();
		
	}
}
