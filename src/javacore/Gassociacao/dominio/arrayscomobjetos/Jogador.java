package javacore.Gassociacao.dominio.arrayscomobjetos;

public class Jogador {
	private String nome;

	
	
	public void impmrime() {
		System.out.println(this.nome);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	
	
}
