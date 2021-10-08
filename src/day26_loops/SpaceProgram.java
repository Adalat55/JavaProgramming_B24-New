package day26_loops;

import java.util.Scanner;

public class SpaceProgram {

    public static void main(String[] args) {
        /*
        Given a String return a version of with spaces between all of the letters.If there is already a space in the String put an underscoreEx: java   -> j a v aspace      -> s p a c emore words -> m o r e _ w o r d s
         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter your string");
        String str = input.nextLine().trim();

        String newVersion="";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==' '){
                newVersion+="_ ";
            }else {
            newVersion += str.charAt(i) + " ";
            }

        }
        System.out.println(newVersion);


    }
}
