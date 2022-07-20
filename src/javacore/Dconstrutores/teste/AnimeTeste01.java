package javacore.Dconstrutores.teste;

import javacore.Dconstutores.dominio.Anime;

public class AnimeTeste01 {
	public static void main(String[] args) {
		
		Anime anime = new Anime("Cavaleiros do Zodiaco","TV",30,"Hentai","Production IG");
		//anime.init();
		anime.imprime();
		//1 -A chamado de construtor pra constudor(this), deve ocorrer somente em construtores em métodos não é possivel.
		//2 - OO this() deve ser o primeiro da ordem do body dos construtores		
	}
}
