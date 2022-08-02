package javacore.ZZClambidas.teste;

import javacore.ZZClambidas.dominio.Anime;
import javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Referente to an instance method of a particular object

public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900),new Anime("Naruto", 500)));
        animeList.sort((a1, a2) -> animeComparators.compareByEpsodesNonStatic(a1,a2));
        //-------------------------Esse cara de cima é igual ao cara debaixo
        animeList.sort(animeComparators::compareByEpsodesNonStatic);

        animeList.sort(animeComparators::compareByEpsodesNonStatic);
        System.out.println(animeList);


    }

}
