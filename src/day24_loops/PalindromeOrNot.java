package day24_loops;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverse="";
        for(int index =word.length()-1; index >=0;index--){

            reverse+=word.charAt(index);




        }
        if(word.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("not polindrome");
        }





    }
}
