package javacore.Zgenerics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildcardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnima(animals);

    }

    //Type erasuere                         //Contrato
    private static void printConsulta(List<? extends  Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals[1] = new Gato();
    }
    private static void printConsultaAnima(List<? super Animal> animals){
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();



    }
}
