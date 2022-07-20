package javacore.Gassociacao.dominio.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next = scanner.nextLine();
		System.out.println(next);
		
		int idade = scanner.nextInt();
		System.out.println(idade);
	
		char chas = scanner.next().charAt(0);
		System.out.println(chas);
		
	}
}
