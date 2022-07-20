package javacore.Kenum.dominio;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa fisica"),
	PESSOA_JURIDICA(2, "Pessoa juridica");

	private int valor;
	/*Valor não pode ser surgido antes dos ENUMERADORES*/
	private String nomeRelatorio;
	
	/*Buscando por atributos*/
	
	TipoCliente(int valor, String nomeRelatorio) {
		this.valor = valor;
		this.nomeRelatorio = nomeRelatorio;
	}
	
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for (TipoCliente tipoCliente : values()) {
			if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}
		return null;
	}

	public int getValor() {
		return valor;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}
	
	
	
	
	
}
