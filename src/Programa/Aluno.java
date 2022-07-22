package Programa;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparator<Aluno> {
    private int prontuario;
    private String nome;


    public Aluno(int prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
    }


    @Override
    public int compare(Aluno aluno, Aluno t1) {
        return this.getProntuario();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return prontuario == aluno.prontuario && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prontuario, nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "prontuario=" + prontuario +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

