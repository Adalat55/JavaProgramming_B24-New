package office_hours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class EmailArray {
    public static void main(String[] args) {
/*
    ask the user to enter last name
              -> all lowercase

        ask the user to enter last name
            -> first letter uppercase, the rest lowercase
            -> first three letter of the first name

       ask the user to enter their favorite number
            -> the number * lastname.length

            email format : last name + . + first name + number + .gmail.com

            store the emails into an array
 */
        Scanner input =new Scanner(System.in);
        System.out.println("enter how many emails");
        int size= input.nextInt();

        String[] email = new String[size];

        for(int i =0; i<size;i++){
            System.out.println("enter your last name");
             String lastName= input.next().toLowerCase();

            System.out.println("enter first name");
             String firstName= input.next().toLowerCase();
             firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1,3);

            System.out.println("enetr favouroite number");
            int favNum= input.nextInt()*lastName.length();

            email[i]= lastName+"."+ firstName+favNum+"@gmail.com";

        }

        System.out.println(Arrays.toString(email));
    }
}
