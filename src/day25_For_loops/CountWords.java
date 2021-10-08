package day25_For_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your sentence");
        String str = input.nextLine().trim();

        int counter=0;

        for(int i=0; i<str.length();i++){

           if(str.charAt(i)==' '){
               counter++;
           }



        }  System.out.println("number of words in this string is: "+(counter+1));




    }
}
