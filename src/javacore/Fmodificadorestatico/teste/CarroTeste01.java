package javacore.Fmodificadorestatico.teste;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes",275);
        Carro carro3 = new Carro("Audi",290);

        //System.out.println(Carro.velocidadeLimite);
        //Carro.velocidadeLimite = 180;
        //System.out.println(Carro.velocidadeLimite);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
