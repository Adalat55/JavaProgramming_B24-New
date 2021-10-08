package day09_Scanner;
import java.util.Scanner;
/*
create a class EvenOrOddcreate a main methodcreate a Scanner objectAsk the user to enter an int number, print if the number is even or odd as boolean values
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here:");
        int num = input.nextInt();
        boolean isEven = num %2 ==0;
        boolean isOdd = num % 2 !=0;
        System.out.println("This number is even: " + isEven);
        System.out.println("this number is odd: " + isOdd);

    }


}
