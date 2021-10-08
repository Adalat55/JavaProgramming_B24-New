package replit_practices.untill_loops;

import java.util.Scanner;

public class CreateEmail {
    public static void main(String[] args) {
/*
Ask user to enter two strings. Bothstrings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word for email. Make sure it is  at least 6 characters long");
        String firstWord= input.next();
        System.out.println("enter second word for email. Make sure it is  at least 6 characters long");
        String secondWord= input.next();

        if(firstWord.length()>=6&&secondWord.length()>=6){

           String email = ""+firstWord.substring(0,4)+secondWord.substring(secondWord.length()-3)+"@cybertek.com";

            System.out.println(email.toLowerCase());



        }else{
            System.out.println("Invalid data");
        }




    }
}
