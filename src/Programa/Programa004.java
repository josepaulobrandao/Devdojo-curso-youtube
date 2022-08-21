package Programa;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa004 {
	public static void main(String[] args) {
		
		
		 	Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        /*
	        String  us = NumberFormat.getInstance().format(Locale.US); 
	        String  china = NumberFormat.getInstance().format(Locale.CHINA); 
	        String  france = NumberFormat.getInstance().format(Locale.FRANCE); 
	        String  india = NumberFormat.getInstance().format(new Locale("en","IN")); 
	        */

	        NumberFormat us1 = NumberFormat.getCurrencyInstance(Locale.US);
	        String us = us1.format(payment);
	        
	        NumberFormat china2 = NumberFormat.getCurrencyInstance(Locale.CHINA); 
	        String china = china2.format(payment);
	        
	        NumberFormat france3 = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
	        String france = france3.format(payment);
	        
	        NumberFormat india1 = NumberFormat.getCurrencyInstance(new Locale("en","IN")); 
	        String india = india1.format(payment);

	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
		
	}


	        

}
	 
	
	 