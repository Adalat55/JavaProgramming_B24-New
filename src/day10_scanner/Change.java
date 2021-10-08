package day10_scanner;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" enter a number from1 to 99");
        int num = input.nextInt();
        int quarter = num/25;
        int dimes = num%25/10;
        int nickels = (num-quarter -dimes)/5;

        System.out.println(quarter);
        System.out.println(dimes);
        System.out.println(nickels);
    }
}
