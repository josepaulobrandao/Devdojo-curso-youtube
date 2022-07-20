package javacore.Gassociacao.dominio.teste;

import javacore.Gassociacao.dominio.exercicio2.Aluno;
import javacore.Gassociacao.dominio.exercicio2.Local;
import javacore.Gassociacao.dominio.exercicio2.Professor;
import javacore.Gassociacao.dominio.exercicio2.Seminario;

public class AssociacaoTeste {
	public static void main(String[] args) {
		
		Local local = new Local("Av. Tonico lenci");
		Aluno aluno = new Aluno("Naruto", 18);	
		Professor professor = new Professor("Barba branca", "Pirata");
		Aluno[] alunosParaSeminario = {aluno};
		Seminario seminario = new Seminario("One Picie", alunosParaSeminario, local );
		
		Seminario[] seminariosDisponiveis = {seminario};
		professor.setSeminarios(seminariosDisponiveis);
		professor.imprime();
		
		
	}
}
