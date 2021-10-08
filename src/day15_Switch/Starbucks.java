package day15_Switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbukcs");
        System.out.println("Which size would you like ");
        String size = input.next();

        double price = 0;
        int calories = 0;
        boolean validOrder=true;

        switch(size) {
            case "tall":
                price = 3.50;
                calories = 100;
                break;
            case "grande":
                price = 4.50;
                calories = 150;
                break;
            case "venti":
                price = 5.30;
                calories = 200;
                break;
            default:
                System.out.println("we dont serve that size");
                validOrder=false;
        }
        if(validOrder) {
            System.out.println("your order was " + size);
            System.out.println("Total price is " + price);
            System.out.println("total calories " + calories);
        }

    }
}
