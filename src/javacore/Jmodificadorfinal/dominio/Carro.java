package javacore.Jmodificadorfinal.dominio;

public class Carro { /*Para brekar o exdends de super classses, basta incluir o operador FINAL e esta não poderá ser extendida*/

	private String nome;
	public static final double VELOCIDADE_LIMITE = 250;
	public final Comprador COMPRADOR = new Comprador();
	//public  final double VELOCIDADE_LIMITE;
	//public  final double VELOCIDADE_LIMITE;
	
	/*outra forma de inicializar*/
	
	/*static {
		VELOCIDADE_LIMITE = 250;
	}
	*/
	/* {
		VELOCIDADE_LIMITE = 250;
	}
	*/
	
	/* 
	public Carro() {
		VELOCIDADE_LIMITE = 250;
	}
	*/
	
	
	
	public final void imprime() {
		System.out.println(this.nome);
	}
	
	public String getNome() {
		return nome;
	}
	public static double getVelocidadeLimite() {
		return VELOCIDADE_LIMITE;
	}
	public Comprador getCOMPRADOR() {
		return COMPRADOR;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
