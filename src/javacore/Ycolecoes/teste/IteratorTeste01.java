package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        //List<Manga> mangas = new ArrayList(6);

        mangas.add(new Manga(5L,"Attack on  titan",19.9,0));
        mangas.add(new Manga(1L,"Bersek",9.5,5));
        mangas.add(new Manga(4L,"Helsing",3.2,0));
        mangas.add(new Manga(3L,"Pokemon",11.20,2));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            //Manga manga = mangaIterator.next();
//            if(mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
