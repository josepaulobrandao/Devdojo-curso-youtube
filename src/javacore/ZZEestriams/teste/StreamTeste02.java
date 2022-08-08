package javacore.ZZEestriams.teste;

import javacore.ZZEestriams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste02 {
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
        List<String> collect = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

                System.out.println(collect);

    }
}
