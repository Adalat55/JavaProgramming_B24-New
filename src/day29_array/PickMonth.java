package day29_array;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ask the user to enter a month number
        Print which month they select
        1 -> January
        ..
        12-> December
        */
        String [] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter a month number: ");
        int month = input.nextInt();

        System.out.println(" the month you picked is: "+ months[month-1]);









    }
}
