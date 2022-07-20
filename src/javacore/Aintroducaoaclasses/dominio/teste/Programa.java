package javacore.Aintroducaoaclasses.dominio.teste;

import java.util.ArrayList;
import java.util.Scanner;

 class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> printValues = new  ArrayList<>();
        System.out.println("### Enter the values ###");
        int inputValue = scanner.nextInt();
        boolean isNumberZero = false;
        while(inputValue != 0 ) {
            if (!isNumberZero) {
                printValues.add(inputValue);
                System.out.print("Enter the new value: ");
                inputValue = scanner.nextInt();
            }
        }
      System.out.println(printValues);
      System.out.println("END");
    }
}
