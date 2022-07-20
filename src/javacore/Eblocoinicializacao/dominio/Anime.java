package javacore.Eblocoinicializacao.dominio;

public class Anime {
	private String nome;
	private int[] episodios;
	{
		
		//bloco de inicialização de instancia
		//1 - Alocado espacço em memoria pro objeto
		//2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
		//3 - Bloco de inicialização é execu//ltado
		//4 - Construtor é execultado
		System.out.println("Dentro do bloco de inicialização");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
		
		
	}
	
	public Anime() {
	
		for(int episodios : this.episodios) {
			System.out.print(episodios + " ");
		}
	}


	public Anime(String nome) {
		this.nome = nome;

	}


	public String getNome() {
		return nome;
	}


	public int[] getEpisodios() {
		return episodios;
	}
	
	
	
}
