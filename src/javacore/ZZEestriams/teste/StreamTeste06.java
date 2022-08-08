
package javacore.ZZEestriams.teste;

import javacore.ZZEestriams.dominio.LightNovel;

import java.util.*;


public class StreamTeste06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara",8.99),
            new LightNovel("Overlord",10.99),
            new LightNovel("Violet Evergarder",5.99),
            new LightNovel("No Game no Life",2.99),
            new LightNovel("FullMetal Alchemist",5.99),
            new LightNovel("Kuno desuga",1.99),
            new LightNovel("Kuno desuga",1.99),
            new LightNovel("Monogataru",4.00)
    ));
    public static void main(String[] args) {
        /*Nesse caso acho que "Match" seria entendido como "ATENDER".

        Atender os critérios.*/



        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));     //Todo mundo que está na lista tem o preço > 9?
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));     //Todo mundo que está na lista tem o preço > 0?
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));    //Nenhum elemento é < 0 nessa lista?
        lightNovels
                .stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()//ultilizar quando não se importa com o resoltado
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() >3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() >3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);


        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
