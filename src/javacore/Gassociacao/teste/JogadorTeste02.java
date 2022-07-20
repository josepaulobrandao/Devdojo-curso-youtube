package javacore.Gassociacao.teste;

import javacore.Eblocoinicializacao.dominio.Jogador;
import javacore.Eblocoinicializacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Caful");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprimi();
    }
}
