package javacore.Ycolecoes.dominio;

public class Smartphone {
	private String serialNumber;
	private String marca;
	public Smartphone(String serialNumber, String marca) {
		super();
		this.serialNumber = serialNumber;
		this.marca = marca;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
/*
  
•It is reflexive: for any non-null reference value x, x.equals(x) should return true. 
•It is symmetric: for any non-null reference values x and y, x.equals(y)should return true if and only if y.equals(x) returns true. 
•It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true. 
•It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return trueor consistently return false, provided noinformation used in equals comparisons on theobjects is modified. 
•For any non-null reference value x, x.equals(null) should return false. 
*/
	
	@Override
	public boolean equals(Object obj ) {
		if( obj == null) return false;
		if(this == obj) return true;
		if(this.getClass()!= obj.getClass()) return false;
		Smartphone smartphone = (Smartphone) obj;
		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}
	
	public int hashcode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode(); 
	}


	@Override
	public String toString() {
		return "Smartphone{" +
				"serialNumber='" + serialNumber + '\'' +
				", marca='" + marca + '\'' +
				'}';
	}
}
