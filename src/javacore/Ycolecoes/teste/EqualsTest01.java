package javacore.Ycolecoes.teste;

import javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
	public static void main(String[] args) {
		
		Smartphone smartphone1 = new Smartphone("1AG", "Iphone");
		Smartphone smartphone2 = new Smartphone("1AG", "Iphone");
		//Smartphone smartphone2 = smartphone1;
		System.out.println(smartphone1.equals(smartphone2));
		
		
	}
}
