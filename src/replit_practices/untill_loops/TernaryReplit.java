package replit_practices.untill_loops;

import java.util.Scanner;

public class TernaryReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int output;
        output=(x>=5)? x:-x;
        System.out.println(output);
    }
}
