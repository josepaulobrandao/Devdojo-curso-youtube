package javacore.Aintroducaoaclasses.modificadorstatic.teste;

import javacore.Aintroducaoaclasses.modificadorstatic.Carro;

public class CarroTeste1 {
	static String teste;
	public static void main(String[] args) {
	Carro c1 = new Carro("Lamborginit", 280);	
	Carro c2 = new Carro("Uno", 275);	
	Carro c3 = new Carro("Fusca", 300);	

	
		//carro1.setVelocidadeLimite(180);
		
	Carro.setVelocidadeLimite(180);
	
	c1.imprime();
	c2.imprime();
	c3.imprime();

	//Carro.velocidadeLimite = 180;
		
	
		
		
		
		
	}
}
