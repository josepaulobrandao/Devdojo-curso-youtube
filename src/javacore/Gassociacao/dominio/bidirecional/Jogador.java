package javacore.Gassociacao.dominio.bidirecional;
public class Jogador {
	private String nome;
	private Time time;/*Um jogador pode ter um time */
	
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	
	 
}
