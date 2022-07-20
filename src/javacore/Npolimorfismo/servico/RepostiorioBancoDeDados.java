package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepostiorioBancoDeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados... ");
		
	}

}
