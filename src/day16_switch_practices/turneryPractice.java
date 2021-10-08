package day16_switch_practices;

import java.util.Scanner;

public class turneryPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the item name?");
        String itemName = input.nextLine();
        System.out.println("what is the price of the "+ itemName);
        double itemPrice = input.nextDouble();
        System.out.println("do you have prime ? ");
        String hasPrime = input.next();
        //add shipping cost of $5 if they dont have Prime

        double finalPrice = hasPrime.equals("yes") ? itemPrice : itemPrice+5;

        System.out.println("your total price for "+itemName + " $"+finalPrice);
    }
}
