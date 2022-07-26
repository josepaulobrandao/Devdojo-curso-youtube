package javacore.ZZBComportamento.Interfaces;

import javacore.ZZBComportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções, conciso
    boolean teste(Car car);//contrato da lambida

    //(parametro) -> <expressão>
    //(Car car) -> hcar.getColor().equals("green");
}
