package javacore.Gassociacao.dominio.unidirecionalmuitosparaum;

public class Escola {
	private String nome;
	/*Uma escola tem várias professores, neste caso, professor é um Array[]*/
	/*65 - Orientação Objetos - Associação pt 02 - Associação unidirecional um para muitos"*/
	private Professor[] professores;
	
	public Escola () {
		
	}
	public Escola(String nome) {
		super();
		this.nome = nome;
	}
	public Escola(String nome, Professor[] professores) {
		super();
		this.nome = nome;
		this.professores = professores;
	}

	public void imprime() {
		System.out.println(this.nome);
		if (professores != null) {
			for (Professor professor : professores) {
				System.out.println(professor.getNome());
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	
	
	
	
}
