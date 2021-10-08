package day09_Scanner;

import java.util.Scanner;
/*
create a class Revenue create a main method create a Scanner objectAsk the user to enter product price and quantity and then calculate the revenue. revenue = price Ã quantity.Â
 */
public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product price:");
        double price = input.nextDouble();
        System.out.println("Eneter the quantity:");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("the revenue for this product is: $"+ revenue);

    }

}
