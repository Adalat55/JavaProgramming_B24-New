package day19_string;

import java.util.Scanner;

public class fixname {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = input.next();
        System.out.println("enter last name");
        String lastName = input.next();

        int initialFirst= firstName.charAt(0);

        char initialLast=lastName.charAt(0);


    }
}
