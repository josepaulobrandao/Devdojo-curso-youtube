package javacore.ZZClambidas.teste;


import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {


        List<String> stringList = List.of("Jose", "Paulo", "naruto", "let", "GHAAA");
        forEach(stringList, (String s) -> System.out.println(s));
        System.out.println("--------------------------");
        forEach(stringList, System.out::println);


    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}

