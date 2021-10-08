package ExtraPractices;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        /*
        Given a String, find and print the unique characters. A character is unique if it only appears once in the String.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String str= input.nextLine();
        String unique="";
        for(int i =0;i<str.length();i++){

            unique+=str.charAt(i); //AAABCCDEEF

            if(!unique.contains(""+str.charAt(i))){
                unique+=i;
            }


        }


    }
}
