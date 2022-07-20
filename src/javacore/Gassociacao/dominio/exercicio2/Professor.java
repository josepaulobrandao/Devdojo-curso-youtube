package javacore.Gassociacao.dominio.exercicio2;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	private Local local;
	
	
	
	
	public void imprime() {
		System.out.println("Professor: " + this.nome);
		if (this.seminarios == null) return;
		System.out.println("Seminarios cadastrados: ");
		for (Seminario seminario : seminarios) {
			System.out.println(seminario.getTitulo());
			System.out.println(seminario.getLocal().getEndereco());
			if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
			System.out.println("** ALUNOS **");
			for (Aluno aluno: seminario.getAlunos()) {
				System.out.println("Aluno: " + aluno.getNome() + aluno.getIdade());
			}
		}
	}
	public Professor(String nome) {
		this.nome = nome;
	}

	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}

	public Professor(String nome, String especialidade, Seminario[] seminarios, Local local) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
		this.local = local;
	}

	public Local getLocal() {
		return local;
	}



	public void setLocal(Local local) {
		this.local = local;
	}



	public Seminario[] getSeminarios() {
		return seminarios;
	}



	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	
}
