package javacore.Zgenerics.Teste;

import javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Goku");
        lista.add("Goku");

        for (Object o: lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Goku"));

//        for (String o: lista) {//ClassCastException
//            System.out.println(o);
//        }

        for (Object o: lista) {
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
