package javacore.Gassociacao.dominio.exercicio;

import java.util.Arrays;

public class Seminarios {
	private String[] seminarios;
	private Aluno aluno;
	private String titulo;
	
	public Seminarios() {
		
	}

	
	public void imprime() {
		System.out.println(aluno.getNome());
		
	}
	
	public Seminarios( String titulo) {
		super();
		this.titulo = titulo;
	}

	public String[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(String[] seminarios) {
		this.seminarios = seminarios;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "Seminarios [seminarios=" + Arrays.toString(seminarios) + ", aluno=" + aluno + ", titulo=" + titulo
				+ "]";
	}

	
	



	
	
}
