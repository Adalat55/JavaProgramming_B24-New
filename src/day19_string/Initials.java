package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        ask use to enter last name
         ask use to enter last name
          then print the initials
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name ");

        String firstName = input.next();

        System.out.println("enter your last name ");

        String lastName = input.next();



String initials = ""+firstName.charAt(0)+lastName.charAt(0);

        System.out.println(initials.toUpperCase());
    }
}
