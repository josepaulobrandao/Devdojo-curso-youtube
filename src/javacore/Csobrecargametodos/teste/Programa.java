package javacore.Csobrecargametodos.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        //Entrar com uma data final
        //mostrar um  rol de datas partindo de hoje até a data final digitada pelo usuário

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate dataInicial = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter for date: ");
        Date data = sdf.parse(scanner.next());

        LocalDate localDate = LocalDate.parse(scanner.next(), formatter);
        System.out.println(sdf.format(data));
        System.out.println(localDate);
    }
}
