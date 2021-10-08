package ExtraPractices;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        /*
        Create ID [String]Given a first name and last name create and return an id using the following format:the first letter of the first name as lowercase,the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,the length of the first String multiplied by 2first name: johnlast name: smithid: jSmi8
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter first name");
        String first= input.next().toLowerCase();
        System.out.println("enter last name");
        String  last=input.next();
        String ID="";

       ID=first.substring(0,1)+last.substring(0,1).toUpperCase()+last.substring(1,3).toLowerCase()+first.length()*2;

        System.out.println(ID);



    }
}
