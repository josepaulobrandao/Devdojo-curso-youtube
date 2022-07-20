package javacore.Aintroducaoaclasses.modificadorstatic;

public class Pessoa {
	private String nome;
	private String idade;
	public static String sexo = "M";
	
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, String idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}

	
	public void imprime() {
		System.out.println("Sexo = "  + this.sexo);
		System.out.println("Objeto = "  + Pessoa.sexo);

	}


}
