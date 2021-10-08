package day10_scanner;

import java.util.Scanner;

public class ChangeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cents, quarters, dimes, nickels, pennies;

        System.out.println("Hello, welcome to the change machine");
        System.out.println("please enter your cents from 1-99");
        cents = input.nextInt(); // 83/25
        quarters = cents/25;
        cents %=25;
        dimes = cents / 10;
        cents %=10;



    }
}
