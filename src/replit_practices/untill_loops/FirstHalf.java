package replit_practices.untill_loops;

import java.util.Scanner;

public class FirstHalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        System.out.println(""+word.substring(0,length/2)+word.substring(0,length/2));

    }
}
