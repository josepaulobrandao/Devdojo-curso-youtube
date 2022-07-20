package javacore.Gassociacao.dominio.teste;

import javacore.Gassociacao.dominio.exercicio.Aluno;
import javacore.Gassociacao.dominio.exercicio.Seminarios;

public class TesteProgramaExc {
	public static void main(String[] args) {
		/*ALUNO*/
		Seminarios seminario1 =  new Seminarios("MATEMATICA");
		
		Seminarios[] seminariosAlunos = new Seminarios[20];
		Aluno aluno1 = new Aluno("Jose Paulo", 18, seminariosAlunos);
		System.out.println(aluno1.toString());
		
		
		
		
	}
}
