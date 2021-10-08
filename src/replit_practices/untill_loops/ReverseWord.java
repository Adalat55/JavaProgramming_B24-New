package replit_practices.untill_loops;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length=word.length();

        if(length==5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }
        else if(length<=5){
            System.out.println("Too short!");
        }
        else if(length>=5){
            System.out.println("Too long!");
        }

    }
}
