package ExtraPractices;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        /*
        Given a sentence determine how many words are in the String.Ex: Input: This has multiple wordsOutput:4
         */
        Scanner input =new Scanner(System.in);
        System.out.println("enter your string");
        String msg= input.nextLine();
        int numberOfSpaces=0;

        for(int i =0;i<msg.length();i++){

            if(msg.charAt(i)==' '){
                numberOfSpaces++;
            }

        }
        System.out.println("number of words: "+(numberOfSpaces+1));


    }
}
