package javacore.Npolimorfismo.pratice;

public enum TipoPagamentoCliente {
	DEBITO {

		@Override
		public double calculaTipoDePagamento(int valor) {
			return valor * 0.45;
		}
		
	},CREDITO{

		@Override
		public double calculaTipoDePagamento(int valor) {
			return valor * 0.10;
		}
		
	};

	public abstract double calculaTipoDePagamento(int valor);
}
