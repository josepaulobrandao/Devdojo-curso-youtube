package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepostiorioArquivo implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando arquivo");
		
	}
}
