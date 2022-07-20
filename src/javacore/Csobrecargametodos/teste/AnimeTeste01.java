package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
	public static void main(String[] args) {
		
		Anime anime = new Anime();
		
		anime.init("Youg oh", "TV", 30);
		anime.init("Youg oh", "TV", 30,"A��o");
		anime.setGenero("Hentai");
//		System.out.println(anime);
		
		
//		anime.setTipo("TV");
//		anime.setEpisodios(4);
//		anime.setNome("Dragomball");
		anime.imprime();
		
		
	}
}
