package javacore.Zgenerics.Teste;


import java.util.ArrayList;
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

    //Type erasuere                         //Contrato: qualquer tipo de lista que seja : List<? extends Animal>
                                            //Qualquer tipo de lista [List<? s] que seja um subclass ou Animal
                                            //(List<? extends  Animal> animals) vira uma interface
    private static void printConsulta(List<? extends  Animal> animals){//Animal e qualquer um que seja filho
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals[1] = new Gato();
    }

    //Contrato: qualquer tipo de objeto que seja um Animal ou um super de Animal: List<? super Animal>
    //Qualquer tipo de lista [List<? s] que seja um Super Class

    private static void printConsultaAnima(List<? super Animal> animals){//Animal e qualquer um que seja pai -- Só aceita super classe

        Animal animal = new Cachorro();//Teste é um : Um cachorro é um animal? = SIM
        Animal animal2 = new Gato();//Teste é um : Um gato é um animal? = SIM

        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
