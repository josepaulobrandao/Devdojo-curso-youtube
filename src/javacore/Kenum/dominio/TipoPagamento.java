package javacore.Kenum.dominio;

public enum TipoPagamento {
	/*Pode ser usado no padrão do projeto strategy*/
	/*Sobrescrita de métodos*/
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
	/*Metodo abstrato não TEM corpo - metodo que foi criado para ser sobrescrito*/
	public abstract double calcularDesconto(double valor);

}
