package day10_scanner;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String product = input.nextLine();
        System.out.println("Enter the product price");
        double price = input.nextDouble();
        System.out.println("enter the quantity");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println("enter your full name");
        String fullName= input.nextLine();
        double total = price * quantity;
        System.out.println(fullName+ ", your order for "+ quantity+" "+ product + " is placed. Your total is: $ " + total);



    }
}
