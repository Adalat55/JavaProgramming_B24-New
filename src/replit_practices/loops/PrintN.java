package replit_practices.loops;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0;i<n;i++){
            System.out.print("*");
        }
    }
}
