package day09_Scanner;
import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your product name:");
        String product= input.nextLine();
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        double totalCost = price * quantity;
        System.out.println(fullName + ", your order for "+ quantity+product+" has been placed. Your total cost $"+totalCost);




    }
}
