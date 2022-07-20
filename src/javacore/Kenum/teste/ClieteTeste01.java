package javacore.Kenum.teste;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClieteTeste01 {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		
		TipoCliente tipoCiente =  TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCiente.getNomeRelatorio());
		
		
		TipoCliente tipoCiente2 =  TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
		System.out.println(tipoCiente2);
	}

}
