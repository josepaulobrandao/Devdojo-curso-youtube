package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class ImpCalculadora implements Calculadora {

    @Override
    public int MinhaInterfaceFuncional(Integer nums) {
        return 0;
    }
}

public class programa001 {
    public static void main(String[] args) {

        List<Integer> printNumbers  = List.of(1,2,4,6,4,99,43);
        System.out.println(filter(printNumbers, num -> num % 2 == 0));


    }

    private  static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List<T> filteredList =  new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
