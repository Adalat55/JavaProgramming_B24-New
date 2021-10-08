package replit_practices.loops;

import java.util.Scanner;

public class RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String big= "";
        for(int i =0; i <count-1;i++) {
            big += word+separator;
        }
            big+=word;

        System.out.println(big);





    }
}
