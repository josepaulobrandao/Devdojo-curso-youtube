package javacore.Gassociacao.dominio.unidirecionalmuitospramuitos;
/* 65 - Orienta��o Objetos - Associa��o pt 02 - Associa��o unidirecional um para muitos */
public class Jogador {
	private String nome;
	private Time time; /*Um jogador pode ter um time */
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	public void imprime() {
		System.out.println(this.nome);
		if (time != null) {			
			System.out.println(time.getNome());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
	 
}
