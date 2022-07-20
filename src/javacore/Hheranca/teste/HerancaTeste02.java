package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste02 {
    public static void main(String[] args) {

    	Endereco endereco = new Endereco();
    	endereco.setRua("Rua 3");
    	endereco.setCep("07866-879");
    	
    	Pessoa pessoa = new Pessoa("Orochimaru");
    	pessoa.setCpf("464-4467-464-4");
    	pessoa.setEndereco(endereco);
    	pessoa.imprime();
    	
    	
    	Funcionario funcionario = new Funcionario("Minato");
    	funcionario.setCpf("444-444-444-44");
    	funcionario.setEndereco(endereco);
    	funcionario.setSalario(20000);
    	System.out.println("---------------");
    	funcionario.imprime();
    	
    	
    	




    }
}
