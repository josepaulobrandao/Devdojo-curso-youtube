package javacore.ZZBComportamento.Interfaces;

import javacore.ZZBComportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, fun��es, conciso
    boolean teste(Car car);//contrato da lambida

    //(parametro) -> <express�o>
    //(Car car) -> hcar.getColor().equals("green");
}
