package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Manga;
import javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class  SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone =   new Smartphone("123","Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on  titan",19.9,0));
        mangas.add(new Manga(1L,"Bersek",9.5,5));
        mangas.add(new Manga(4L,"Helsing",3.2,0));
        mangas.add(new Manga(3L,"Pokemon",11.20,2));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));
        mangas.add(new Manga(2L,"Dragomball z",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
