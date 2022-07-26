package javacore.ZZBComportamento.teste;

import javacore.ZZBComportamento.Interfaces.CarPredicate;
import javacore.ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste02 {

    private static  List<Car> cars = List.of(
            new Car("green",2011),
            new Car("black",1998),
            new Car("red",2019));

    public static void main(String[] args) {
/*
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean teste(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
    }
    */

        List<Car> greenCars = filter(cars, car -> {
            return car.getColor().equals("green");
        });
        List<Car> redCars = filter(cars, (Car podeSerQualquerNome) -> podeSerQualquerNome.getColor().equals("red"));
                                          /*?* boolean teste(Car car);/
        /*O mais importante é que o tipo tenque bater com a interface*/
        List<Car> yarBeforCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yarBeforCars);


    }
    /*
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
          if(carPredicate.teste(car)){
              filterCar.add(car);
          }
        }
        return filterCar;
    }
    */

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
