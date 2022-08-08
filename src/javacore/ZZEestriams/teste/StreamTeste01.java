package javacore.ZZEestriams.teste;


import javacore.ZZEestriams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1 - ORder LightNovem by title
//2 - Reatrive the frist 3 light movesl with price lesse than 4
public class StreamTeste01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarder",5.99),
            new LightNovel("No Game no Life",8.99),
            new LightNovel("FullMetal Alchemist",5.99),
            new LightNovel("Kuno desuga",1.99),
            new LightNovel("Monogataru",4.00)
    ));
        public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
            for (LightNovel lightNovel : lightNovels) {
                if(lightNovel.getPrice() <= 4 ){
                    titles.add(lightNovel.getTitle());
                }
                if(titles.size() >= 3) {
                    break;
                }
            }

            System.out.println(lightNovels);
            System.out.println(titles);


    }
}
