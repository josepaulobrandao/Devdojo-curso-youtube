package javacore.Gassociacao.dominio.teste;

public class TesteForeach {
	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		String[] arrays = new String[] {"1","2","3","4","5"};
		System.out.println(arrays.length);
		
		
		for(String imprimeArray : arrays) {
			if (imprimeArray == Integer.toString(1)) {
				System.out.println("Este é igual a " +  imprimeArray);
			}
			System.out.println(imprimeArray);
		}
		
	}
}
