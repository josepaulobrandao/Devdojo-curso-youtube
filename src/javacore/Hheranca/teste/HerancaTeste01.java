package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Funcionario;


public class HerancaTeste01 {
    public static void main(String[] args) {
    	
		//bloco de inicializa��o de instancia
		//0 - Bloco de inicializa��o est�tico da super classe � executado quando a JVM carregar a classe PAI
		//1 - Bloco de inicializa��o est�tico da SUBCLASSE � executado quando a JVM carregar a classe FILHA
		//2 - Alocado o espa�o em mem�ria pro objeto da calsse PAI
		//3 - Cada atributo de classe � criado e inicializado com valores default ou o quer for passado da classe PAI
		//4 - Bloco de inicializa��o da SUPERCLASSE � execultado na ordem em que aparece
    	//5 - Construtor � ex3ecultado da SUPERCLASSE � execultado
    	//6 - Alocado o espa�o em mem�ria pro objeto da calsse SUBCLASSE
    	//7 - Cada atributo de SUBCLASSE � criado e inicializado com valores default ou o quer for passado da classe PAI
    	//8 - Bloco de inicializa��o da SUPERCLASSE � execultado na ordem em que aparece
    	//9 - Construtor � ex3ecultado da SUPERCLASSE � execultado

    	Funcionario funcionario = new Funcionario("Jiraya");
    
    	
    	
    }
}
