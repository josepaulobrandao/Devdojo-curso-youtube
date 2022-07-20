package javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("--------------------");
        Integer[] numerosArrays = new Integer[3];
        numerosArrays[0] = 1;
        numerosArrays[1] = 2;
        numerosArrays[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArrays);
        arrayToList.set(0,12);

        System.out.println(Arrays.asList(numerosArrays));
        System.out.println(Arrays.asList());
        System.out.println("------------------");


        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArrays));
        numerosList.add(15);
        System.out.println(numerosList);

       List<String>  strings = Arrays.asList("1","2");
       List.of("1", "2");

    }
}
