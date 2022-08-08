package javacore.ZZDoptional.teste;

import javacore.ZZDoptional.domain.Manga;
import javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionTeste02 {
    public static void main(String[] args) {
        Optional<Manga> boku_no_hero = MangaRepository.findByIdTitle("Boku no Hero");
        boku_no_hero.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(boku_no_hero);

       Manga byId = MangaRepository.findById(2).orElseThrow(IllegalAccessError::new);
       System.out.println(byId);

        Manga newManga = MangaRepository.findByIdTitle("Maria").orElseGet(() -> new Manga(3, "Drifters",20));
        System.out.println(newManga);





    }

}
