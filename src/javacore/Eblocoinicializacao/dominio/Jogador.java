package javacore.Eblocoinicializacao.dominio;

public class Jogador {
	private String nome;
	private Time time;

	public Jogador(String nome) {
		super();
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimi() {
		System.out.println(this.nome);
		if(time!= null) {
			System.out.println(time.getNome());
		}
	}
	
}
