package javacore.ZZDoptional.repositorio;

import javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangaList = List.of(new Manga(1, "Boku no Hero",50),new Manga(2, "override",64));
/*
    private static Optional<Manga> findByTitle(String title){
        Manga found = null;
        for (Manga manga : mangaList){
            if(manga.getTitle().equals(title)){
                found = manga;
            }
        }
        return  Optional.of(found);
    }



    private static Optional<Manga> findById(Integer id){
        Manga found = null;
        for (Manga manga : mangaList){
            if(manga.getId().equals(id)){
                found = manga;
            }
        }
        return  Optional.of(found);
    }

 */

    public static Optional<Manga> findByIdTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate ){
        Manga found = null;
        for (Manga manga : mangaList){
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return  Optional.of(found);
    }

}
