package javacore.ZZDoptional.teste;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class OptionTeste01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha hub Dev dojo é bom");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("------------");
        Optional<String> name = findName("jose");
        String empty = name.orElse("EMPTY");
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);

    }
    private static Optional<String>  findName(String name) {
        List<String> list = List.of("jose", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
