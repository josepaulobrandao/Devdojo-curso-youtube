package javacore.Aintroducaoaclasses.dominio.teste;

public class Anime {
	private String nome;
	private  static int[] episodios;
	
	static {
		
		//bloco de inicializa��o de instancia
		//0 - Bloco de inicializa��o � carregado quando a JVM carregar a classe
		//1 - Alocado espac�o em memoria pro objeto
		//2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
		//3 - Bloco de inicializa��o � execultado
		//4 - Construtor � execultado
		System.out.println("Dentro do bloco de inicializa��o statico");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
		
		
	}
	static {
		
		//bloco de inicializa��o de instancia
		//0 - Bloco de inicializa��o � carregado quando a JVM carregar a classe
		//1 - Alocado espac�o em memoria pro objeto
		//2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
		//3 - Bloco de inicializa��o � execultado
		//4 - Construtor � execultado
		System.out.println("Dentro do bloco de inicializa��o statico 2 ");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
		
		
	}
	static {
		
		//bloco de inicializa��o de instancia
		//0 - Bloco de inicializa��o � carregado quando a JVM carregar a classe
		//1 - Alocado espac�o em memoria pro objeto
		//2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
		//3 - Bloco de inicializa��o � execultado
		//4 - Construtor � execultado
		System.out.println("Dentro do bloco de inicializa��o statico 3 ");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
		{
			System.out.println("Dentro do bloco de inicializa��o N�O estatico");
		}
		
		
	}
	
	public Anime() {
	
		for(int episodios :Anime.episodios) {
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
