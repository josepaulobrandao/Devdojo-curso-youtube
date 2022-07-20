package javacore.Minterfaces.teste;

import javacore.Minterfaces.dominio.DataLoader;
import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoadeTest01 {
	public static void main(String[] args) {
		//PRIVATE -> DEFAULT -> PROTECTED -> PUBLIC
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		databaseLoader.load();
		fileLoader.load();
		
		databaseLoader.remove();
		fileLoader.remove();
		
		databaseLoader.checkPermission();
		fileLoader.checkPermission();
		
		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();
	}
}
