package javacore.ZZClambidas.service;

import javacore.ZZClambidas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpsodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpsodes(), a2.getEpsodes());
    }

    public int compareByEpsodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpsodes(), a2.getEpsodes());
    }
}

