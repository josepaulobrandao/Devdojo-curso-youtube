package javacore.ZZClambidas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> stringsLuist = List.of("Wiliam", "Jose Paulo", "Luffy", "Zoero");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(stringsLuist, (String s) -> System.out.println(s));
        forEach(stringsLuist,  s -> System.out.println(s)); //<------1 Simplificando - removendo os parenteses e o tipo
        forEach(stringsLuist, System.out::println);//<------2 Simplificando - removendo os parenteses,tipo e variavel dexando somente o ::
        forEach(integers, (Integer i) -> System.out.println(i));

    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
    //add
}
