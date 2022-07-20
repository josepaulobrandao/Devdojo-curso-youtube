package javacore.Kenum.dominio;

public enum TipoPagamento {
	/*Pode ser usado no padr�o do projeto strategy*/
	/*Sobrescrita de m�todos*/
	DEBITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.1;
		}
	}, CREDITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.05;
		}
	};
	/*Metodo abstrato n�o TEM corpo - metodo que foi criado para ser sobrescrito*/
	public abstract double calcularDesconto(double valor);

}
