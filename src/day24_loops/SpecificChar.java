package day24_loops;

import java.util.Scanner;

public class SpecificChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String word = input.nextLine();
       int times=0;
       for(int i = 0; i<word.length(); i++){

           if(word.charAt(i)=='a'){

           times++;}
       }
        System.out.println(times);

    }
}
