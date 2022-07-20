package javacore.Oexecao.exeption.teste;

import java.io.File;
import java.io.IOException;

public class ExeptionTeste01 {
	public static void main(String[] args) {
		criarNovoArquivo();
	}

	private static void criarNovoArquivo() {
		File file = new File("C:/Users/jose.brandao/Documents/Java e projetos/Java/youtube/devdojoeclipse/cursodevdojo/src/arquivo/teste.txt");
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
