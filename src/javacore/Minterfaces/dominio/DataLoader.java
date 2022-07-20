package javacore.Minterfaces.dominio;

public interface DataLoader {
	public abstract void load();
	public static final int DATA = 12;
	default  void checkPermission() {
		System.out.println("Fazendo checagem de permissões.. ");
	}
	
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro do retrieveMaxDataSize na interface DataLoader ");
	}

}
