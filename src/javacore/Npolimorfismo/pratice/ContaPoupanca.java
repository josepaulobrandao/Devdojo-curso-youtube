package javacore.Npolimorfismo.pratice;

public class ContaPoupanca extends Conta {
	private String checkEspecial;
	private static final double CALCULA_TAXA_CONTA_POUPANCA = 0.6;
	
	public ContaPoupanca(String nomeCliente, String cpf, TipoCliente tipoCliente, double valor) {
		super(nomeCliente, cpf, tipoCliente, valor);
	}

	@Override
	public  void taxa() {
		double calculo = this.getValor() * CALCULA_TAXA_CONTA_POUPANCA;
		System.out.println("Tipo de conta referenciada: " + this.getTipoCliente());
		System.out.println("Taxa: " + calculo);

	}

	
	
	
	
}
