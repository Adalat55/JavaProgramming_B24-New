package replit_practices.untill_loops;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length= word.length();
        if(length%2!=0&&length>5){


        System.out.println(word.substring((length-1)/2-1,(length-1)/2+2));
        }else{
            System.out.println("invalid");
        }
    }
}
