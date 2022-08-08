package javacore.ZZClambidas.teste;

import javacore.ZZClambidas.dominio.Anime;
import javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Referent to  a construtor

public class MethodReferenceTeste04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900),new Anime("Naruto", 500)));
        animeList.sort(animeComparators ::compareByEpsodesNonStatic);
        System.out.println(animeList);
                    //tipo1 tipo2   retorar um Anime
        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction2.apply("Naruto", 36));
        System.out.println(animeBiFunction.apply("Naruto", 36));


    }

}
