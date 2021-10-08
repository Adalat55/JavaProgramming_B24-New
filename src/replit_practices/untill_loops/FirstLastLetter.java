package replit_practices.untill_loops;

import java.util.Scanner;

public class FirstLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char firstLetter =word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        System.out.println(firstLetter+""+lastLetter);
    }
}
