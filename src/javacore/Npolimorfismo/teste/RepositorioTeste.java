package javacore.Npolimorfismo.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepostiorioBancoDeDados;

public class RepositorioTeste {

	public static void main(String[] args) {
		Repositorio repositorio = new RepostiorioBancoDeDados();
		repositorio.salvar();
		
		List<String> list = new LinkedList();
		
		list.add("Goku");
		list.add("Vedita");
		list.add("Kuririm");
		
		System.out.println(list);
		

		
		
	}

}
