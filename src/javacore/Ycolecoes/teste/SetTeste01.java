package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {

        //Set<Manga> mangas = new HashSet<>();//Não mantem a ordem de inserção, sequindo assim, o esquema do HashcodeEquals
        Set<Manga> mangas = new LinkedHashSet<>();//mantem a ordem de inserção
        mangas.add(new Manga(5L,"Attack on  titan",19.9,0));
        mangas.add(new Manga(1L,"Bersek",9.5,5));
        mangas.add(new Manga(4L,"Helsing",3.2,0));
        mangas.add(new Manga(3L,"Pokemon",11.20,2));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
