package javacore.Gassociacao.dominio.unidirecionalmuitosparaum;

public class Escola {
	private String nome;
	/*Uma escola tem v�rias professores, neste caso, professor � um Array[]*/
	/*65 - Orienta��o Objetos - Associa��o pt 02 - Associa��o unidirecional um para muitos"*/
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
