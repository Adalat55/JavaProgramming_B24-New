package day31_arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        /*
        ask the user to enter any sentence

        reverse the sentence

        ex: today is wednesday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence= input.nextLine();
        String[] words = sentence.split(" ");
        String reverse="";
        for (int i = words.length-1; i>=0;i--){
          reverse+=words[i]+" ";
        }

        System.out.println(reverse.trim());
    }
}
