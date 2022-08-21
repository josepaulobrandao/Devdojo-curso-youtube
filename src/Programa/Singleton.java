package Programa;

public class Singleton {
	public String str;
	private static Singleton singleton;

	private Singleton(){
	}

	static Singleton getSingleInstance(){
	    if(singleton == null){
	        singleton = new Singleton();
	    }
	    return singleton;
	  }
	   public static void main(String args[]) {
           System.out.println(Singleton.getSingleInstance());
       }
}
