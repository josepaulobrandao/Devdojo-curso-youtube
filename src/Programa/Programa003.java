package Programa;

import java.util.ArrayList;

public class Programa003 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> System.out.println(n));
        numbers.forEach((n) -> System.out.println());
        System.out.println("------------------------");
        numbers.forEach(System.out::println);//Method reference
        numbers.forEach((n) -> System.out.println(n + 1));
    }
}
