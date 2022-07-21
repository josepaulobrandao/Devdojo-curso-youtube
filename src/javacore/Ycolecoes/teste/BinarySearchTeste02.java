package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        MnagaByIdComparator mnagaByIdComparator = new MnagaByIdComparator();
        List<Manga> mangas = new ArrayList(6);
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(1L,"Bersek",9.5));
        mangas.add(new Manga(4L,"Helsing",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.20));
        mangas.add(new Manga(2L,"Dragomball z",2.99));

        mangas.sort(mnagaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

      //  Collections.sort(mangas);
        Manga mangaToSearch = new Manga(6L, "Dragomball z", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mnagaByIdComparator));



    }
}
