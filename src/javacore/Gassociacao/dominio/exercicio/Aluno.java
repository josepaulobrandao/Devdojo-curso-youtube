package javacore.Gassociacao.dominio.exercicio;

public class Aluno {
	private String nome;
	private int idade;
	private Seminarios[] seminario;
	
	
	public Aluno() {

	}
	
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno(String nome, int idade, Seminarios[] seminarios) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.seminario = seminarios;
	}
	

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	public Seminarios[] getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminarios[] seminario) {
		this.seminario = seminario;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", seminario=" + seminario + "]";
	}




	
	
}
