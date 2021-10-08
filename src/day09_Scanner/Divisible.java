package day09_Scanner;
import java.util.Scanner;
/*
create a class Divisible create a main method create a Scanner objectAsk the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean valuesEx:Enter a number6565 is divisible by 2: false65 is divisible by 3: false65 is divisible by 5: true
 */
public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
     boolean isDivisibleByTwo = num % 2 ==0;
     boolean isDivisibleByTHree = num % 3 ==0;
     boolean isDivisibleByFive = num % 5 ==0;
        System.out.println(num + " is divisible by 2: " + isDivisibleByTwo);
        System.out.println(num + " is divisible by 3: " + isDivisibleByTHree);
        System.out.println(num + " is divisible by 5: " + isDivisibleByFive);

    }
}
