package javacore.Npolimorfismo.pratice;

public class Teste {
	public static void main(String[] args) {
		
		Conta contaPoupanca = new ContaPoupanca("Maria Bezerra", "464-897-614-10", TipoCliente.PF, 15000);
		System.out.println("------------------------");
		Conta contaSalario = new ContaSalario("Marcelo rezende", "555-784-614-13", TipoCliente.PJ, 1000);
		
		System.out.println(contaPoupanca);
		contaPoupanca.taxa();
		System.out.println(contaSalario);
		contaSalario.taxa();
		
	}

}
