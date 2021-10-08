package replit_practices.untill_loops;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
       String finalWord="";
if(word.toLowerCase().charAt(0)=='x'||word.toLowerCase().charAt(word.length()-1)=='x') {
    if (word.toLowerCase().charAt(0) == 'x') {
        finalWord += word.substring(1);

    }
    if (word.toLowerCase().charAt(word.length() - 1) == 'x') {
        finalWord += word.substring(0, word.length() - 1);
    }
}    else{
          finalWord=word;
        }
        System.out.println(finalWord);

    }
}
