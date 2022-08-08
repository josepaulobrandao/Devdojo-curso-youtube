
package javacore.ZZEestriams.teste;

import javacore.ZZEestriams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class StreamTeste07 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,(x, y) -> x + y));
        System.out.println("--------------------------------------------------");
        integers.stream().reduce( Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));
        System.out.println("--------------------------------------------------");
        System.out.println(integers.stream().reduce(1,(x, y) -> x * y));
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println("--------------------------------------------------");
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);





    }
}
