package javacore.Zgenerics.Teste;


import javacore.Zgenerics.dominio.Barco;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        criarArrayComUmObjetoESemRetorno(new Barco("Canoa Marota"));
        List<Barco> barcoList = criarArrayComUmObjetoEComRetorno(new Barco("Canoa vilha"));
        //List<Barco> barcoComparable = criarArrayComUmObjetoComparable(new Barco("Canoa vilha"));
        //No teste � UM COMPARABLE o BARCO N�O � UM COMPARABLE, POR ISSO DA UM ERRO DE COMPILA��O
        System.out.println(barcoList);
    }

    //Criar um lista do tipo do objeto
    private static <T> void criarArrayComUmObjetoESemRetorno(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }

    //S� deve retornar objetos do tipo List
    private static <T> List<T> criarArrayComUmObjetoEComRetorno(T t){
        List<T> list = List.of(t);
        return  List.of(t);
    }
    //S� deve receber objetos do Tipo Comparable
    private static <T extends Comparable> List<T> criarArrayComUmObjetoComparable(T t){
        List<T> list = List.of(t);
        return  List.of(t);
    }
}


