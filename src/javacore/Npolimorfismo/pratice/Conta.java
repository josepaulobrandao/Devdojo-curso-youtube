package javacore.Npolimorfismo.pratice;

public abstract class Conta implements TaxaPorTransacao {
	private String nomeCliente;
	private String cpf;
	private TipoCliente tipoCliente;
	private TipoPagamentoCliente tipoPagamentoCliente;
	private double valor;
	
	public Conta(String nomeCliente, String cpf, TipoCliente tipoCliente ,double valor) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.tipoCliente = tipoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public double getValor() {
		return valor;
	}

	public static void TipoPagamento() {
		
	}
	
	
	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente +
				", cpf=" + cpf +
				", tipoCliente=" + tipoCliente +
				", tipoClienteID=" + tipoCliente.getIdTipoCliente() + 
				", tipoClienteNomeRelatorio=" + tipoCliente.getNomeRelatorio() + 
		
				"]";
	}
	
	
	

	
	
	
}
