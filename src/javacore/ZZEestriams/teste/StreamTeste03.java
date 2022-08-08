package javacore.ZZEestriams.teste;

import javacore.ZZEestriams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarder",5.99),
            new LightNovel("No Game no Life",8.99),
            new LightNovel("FullMetal Alchemist",5.99),
            new LightNovel("Kuno desuga",1.99),
            new LightNovel("Kuno desuga",1.99),
            new LightNovel("Monogataru",4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
       /* long count1 = lightNovels
                .stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
                */

        System.out.println(count);


    }
}
