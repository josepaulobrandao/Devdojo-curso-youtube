package javacore.ZZClambidas.teste;

import javacore.ZZClambidas.dominio.Anime;
import javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Reference to a static method
public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900),new Anime("Naruto", 500)));

        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(Comparator.comparing(Anime::getTitle));
        //Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
       // Collections.sort(animeList, AnimeComparators::compareByTitle);

        animeList.sort(AnimeComparators::compareByEpsodes);
        System.out.println(animeList);


    }

}
