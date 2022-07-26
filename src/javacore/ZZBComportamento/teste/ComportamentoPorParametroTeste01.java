package javacore.ZZBComportamento.teste;

import javacore.ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {

    private static  List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterByColor(cars, "red"));
        System.out.println(filterByColor(cars,"green"));
        System.out.println("---------------");
        System.out.println(filterByYearBefore(cars,2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")){
                filterCar.add(car);
            }
        }
        return filterCar;
    }


    private static List<Car> filterByColor(List<Car> cars, String cor){
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}
