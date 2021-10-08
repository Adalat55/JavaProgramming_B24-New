package replit_practices.Arrays;

import java.util.Scanner;

public class ReverseArrays2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");
        String reversed="";
        for(int i =words.length; i>0;i--){

            reversed+=words[i-1]+" ";

        }

        System.out.println(reversed);
    }
}
