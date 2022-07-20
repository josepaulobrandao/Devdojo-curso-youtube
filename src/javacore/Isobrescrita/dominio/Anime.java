package javacore.Isobrescrita.dominio;

public class Anime {
	protected String nome;


	public Anime () {
		
	}
	
	@Override
	public String toString() {
		return "Anime [nome=" + nome + "]";
	}

	public Anime(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
