package ExtraPractices;

import java.util.Scanner;

public class BiggestSubstring {
    public static void main(String[] args) {
        /*
        Given a String find the biggest substring of chars that match and print it.Ex: aaabbbcccccddddee Output: ccccc
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String msg = input.nextLine();
        int counter=0;
        String letters="";
        String longest="";
        for(int i =0; i<msg.length()-1;i++){
            letters+=msg.charAt(i);
            if(msg.charAt(i)!=msg.charAt(i+1)){
                if(letters.length()>longest.length()) {
                    longest = letters;
                } letters="";
            }


        }
        System.out.println(longest);
    }
}
