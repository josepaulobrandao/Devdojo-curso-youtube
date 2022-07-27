package javacore.ZZClambidas.teste;

import javacore.Hheranca.dominio.Funcionario;
import javacore.ZZClambidas.dominio.Anime;
import javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Referente to an instance method of an arbitrarty objetc of a prticular type

public class MethodReferenceTeste03 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<String> list = new ArrayList<>(List.of("Berserk", "Veldora", "Hikimary"));
        list.sort(String::compareTo);
        System.out.println(list);

        //s -> Integer.parseInt(s) == Integer::parseInt;
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Berserk"));

    }

}
