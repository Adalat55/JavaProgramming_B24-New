package day13_if_statements;

import java.util.Scanner;

public class ReplitPractices {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Item1 and its price:");
    String item1=scan.next();
    int Price1= scan.nextInt();
    System.out.println("Enter Item2 and its price:");
    String item2=scan.next();
    int Price2= scan.nextInt();
    System.out.println("Enter Item3 and its price:");

    String item3=scan.next();
   int Price3= scan.nextInt();


    System.out.println("Item1: "+item1+" Price: "+Price1+ ", Item2: "+ item2+ " Price: "+Price2+", Item3: "+item3+ " Price: "+Price3);
    System.out.println("Todal price: "+(Price1+Price2+Price3));
}};
