package Programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Programa001 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        for(int i = 1; i < 11; i++){
            result = Math.multiplyExact(N, i);
            System.out.printf("%d x %d = %d\n", N, i, result);
        }
        int resultado = 0;
        for (int i = 0; i < 11; i++){
            resultado = Math.multiplyExact(N, i);
            System.out.println(resultado);

        }

        bufferedReader.close();
    }
}
