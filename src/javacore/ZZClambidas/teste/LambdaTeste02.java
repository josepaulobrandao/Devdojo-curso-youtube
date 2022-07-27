package javacore.ZZClambidas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natus", "Alucard");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<Integer> integers2 = map(strings, String::length);//:: = Método reference

        List<String> strings1 = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(strings1);

    }

    //<---vai receber um                    //<---Tipo de                        //<---Quero receber uma lista de T   //<---Parametro que vai receber
    //                                                                                                                  uma função, ou seja, uma Function de
    //                                                                                                                  T=Tipo e R=Retorno
    //   T=Tipo e R=Retorno                  retorno será uma Lista de
    //                                       R = List<R>
   //         ?                                     ?                                     ?                                     ?
    private static <T, R>                       List<R>                         map(List<T> list,                     Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
