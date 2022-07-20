package javacore.Npolimorfismo.pratice;

public class ContaSalario extends Conta {
	private static final double PERCENTUAL_CONTA_SALARIO = 0.15;
	
	
	public ContaSalario(String nomeCliente, String cpf, TipoCliente tipoCliente, double valor) {
		super(nomeCliente, cpf, tipoCliente, valor);
	}
	

	@Override
	public void taxa() {
		double calc = this.getValor() * PERCENTUAL_CONTA_SALARIO;
		System.out.println("Taxa por transação conta " + this.getTipoCliente());
		System.out.println(calc);
	}
	
	
}
