package javacore.Hheranca.dominio;

public class Funcionario extends  Pessoa {
    private double salario;
    
    static {
    	System.out.println("Bloco estático Funcionario");
    }
    
    {
    	System.out.println("Bloco de inicialização não estático Funcionario 1");
    }
    
    {
    	System.out.println("Bloco de inicialização não estático Funcionario 2");
    }
 
	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor funcionario");
	}
	public void imprime() {
    	super.imprime();					/*Super - pegando a FORMA/ do objeto pessoa e imprimindo no funcinário*/
    	System.out.println("Salário: ");
    }
    public void relatorioPagamento() {
    	/*Operador protecte quando usado, pode ser acessado os atributos da super classe e podendo ser acesso 
    	 * no pacote da propria classe e NÃO PODE ser acessando em outras classes / pacote*/
    	System.out.println("Eu " + this.nome + "Recebi o salario de " + this.salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
