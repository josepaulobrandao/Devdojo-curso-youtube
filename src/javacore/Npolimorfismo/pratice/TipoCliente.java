package javacore.Npolimorfismo.pratice;

public enum TipoCliente {
	PJ(1, "Pessoal Jur�dica"), PF(2, "Pessoal F�sica");

	private String nomeRelatorio;
	private int idTipoCliente;

	TipoCliente(int idTipoCliente, String nomeRelatorio) {
		this.nomeRelatorio = nomeRelatorio;
		this.idTipoCliente = idTipoCliente;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	public int getIdTipoCliente() {
		return idTipoCliente;
	}
	
	
	
}
