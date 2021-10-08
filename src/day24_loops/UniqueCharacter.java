package day24_loops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char givenChar= input.next().toLowerCase().charAt(0);
       int count=0;

        for(int i =0; i<word.length();i++) {


            if (word.charAt(i) == givenChar) {
                count++;

            }

        }
        if(count==1){
            System.out.println("unique");
        }else if(count==0) {
            System.out.println("not in the string");
        }else{
            System.out.println("not unique");
        }







    }
}
