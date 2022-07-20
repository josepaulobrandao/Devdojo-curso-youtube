package javacore.Aintroducaoaclasses.modificadorstatic;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;
	
	
	public Carro() {
		
	}
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeLimite = Carro.velocidadeLimite;
	}


	public void imprime() {
		System.out.println("-------------");
		System.out.println("Velocidade m�xima " + this.velocidadeMaxima);
		System.out.println("velocidade limite " + this.velocidadeLimite);
		
	}
	

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	
	
	
}
