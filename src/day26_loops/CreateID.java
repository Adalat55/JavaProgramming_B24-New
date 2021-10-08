package day26_loops;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the following format:the first letter of the first name as lowercase,the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,the length of the first String multiplied by 2first name: johnlast name: smithid: jSmi8
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName=input.next().toLowerCase();
        System.out.println("enter your last name");
        String lastName= input.next().toLowerCase();

        String IdName="";
        IdName=firstName.substring(0,1).toLowerCase()+lastName.substring(0,1).toUpperCase()+lastName.substring(1,3)+firstName.length()*2;

        System.out.println(IdName);

    }
}
