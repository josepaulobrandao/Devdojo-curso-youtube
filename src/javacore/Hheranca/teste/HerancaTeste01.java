package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Funcionario;


public class HerancaTeste01 {
    public static void main(String[] args) {
    	
		//bloco de inicialização de instancia
		//0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe PAI
		//1 - Bloco de inicialização estático da SUBCLASSE é executado quando a JVM carregar a classe FILHA
		//2 - Alocado o espaço em memória pro objeto da calsse PAI
		//3 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado da classe PAI
		//4 - Bloco de inicialização da SUPERCLASSE é execultado na ordem em que aparece
    	//5 - Construtor é ex3ecultado da SUPERCLASSE é execultado
    	//6 - Alocado o espaço em memória pro objeto da calsse SUBCLASSE
    	//7 - Cada atributo de SUBCLASSE é criado e inicializado com valores default ou o quer for passado da classe PAI
    	//8 - Bloco de inicialização da SUPERCLASSE é execultado na ordem em que aparece
    	//9 - Construtor é ex3ecultado da SUPERCLASSE é execultado

    	Funcionario funcionario = new Funcionario("Jiraya");
    
    	
    	
    }
}
