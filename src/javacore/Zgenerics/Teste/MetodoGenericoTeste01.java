package javacore.Zgenerics.Teste;


import javacore.Zgenerics.dominio.Barco;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        criarArrayComUmObjetoESemRetorno(new Barco("Canoa Marota"));
        List<Barco> barcoList = criarArrayComUmObjetoEComRetorno(new Barco("Canoa vilha"));
        //List<Barco> barcoComparable = criarArrayComUmObjetoComparable(new Barco("Canoa vilha"));
        //No teste é UM COMPARABLE o BARCO NÃO É UM COMPARABLE, POR ISSO DA UM ERRO DE COMPILAÇÃO
        System.out.println(barcoList);
    }

    //Criar um lista do tipo do objeto
    private static <T> void criarArrayComUmObjetoESemRetorno(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }

    //Só deve retornar objetos do tipo List
    private static <T> List<T> criarArrayComUmObjetoEComRetorno(T t){
        List<T> list = List.of(t);
        return  List.of(t);
    }
    //Só deve receber objetos do Tipo Comparable
    private static <T extends Comparable> List<T> criarArrayComUmObjetoComparable(T t){
        List<T> list = List.of(t);
        return  List.of(t);
    }
}


