package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Jose Paulo ");
        Consumidor consumidor2 = new Consumidor("Tecno Dev");

        List<Manga> mangas = new ArrayList(6);

        Manga manga1 = new Manga(5L, "Attack on titan", 19.9);
        Manga manga2 = new Manga(1L,"Bersek",9.5);
        Manga manga3 = new Manga(4L,"Helsing",3.2);
        Manga manga4 = new Manga(3L,"Pokemon",11.20);
        Manga manga5 = new Manga(2L,"Dragomball z",2.99);

        System.out.println(consumidor1);


        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println("---" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("---" + manga.getNome());
            }
        }


    }
}
