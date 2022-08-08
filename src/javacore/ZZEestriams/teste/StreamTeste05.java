
package javacore.ZZEestriams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste05 {
    public static void main(String[] args) {

        List<String> words = List.of("Gomu","Gomu","No","Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        System.out.println("-------------------");

        List<String[]> collect = words.stream().map(w -> w.split(" ")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = words.stream()
         .map(w -> w.split(""))  //Stream<String[]>
         .flatMap(Arrays::stream)       //retornando um Stream de <String>
         .collect(Collectors.toList()); //coletando o Stream

        System.out.println(letters2);

    }
}
