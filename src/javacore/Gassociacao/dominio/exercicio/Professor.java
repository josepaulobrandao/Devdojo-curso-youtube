package javacore.Gassociacao.dominio.exercicio;

import java.util.Arrays;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminarios[] seminarios;
	
	
	public Professor () {
		
	}
	
	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
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
	public Seminarios[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminarios[] seminarios) {
		this.seminarios = seminarios;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", especialidade=" + especialidade + ", seminarios="
				+ Arrays.toString(seminarios) + "]";
	}
	
	
	
}
