package javacore.Gassociacao.dominio.exercicio2;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;
	
	public Seminario(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Seminario (String titulo , Local local) {
		this.titulo = titulo;
		this.local = local;
	}
	

	public Seminario(String titulo, Aluno[] alunos, Local local) {
		super();
		this.titulo = titulo;
		this.alunos = alunos;
		this.local = local;
	}



	public Seminario(String titulo, Aluno[] alunos) {
		super();
		this.titulo = titulo;
		this.alunos = alunos;
	}



	public Aluno[] getAlunos() {
		return alunos;
	}



	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Local getLocal() {
		return local;
	}



	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	
}
