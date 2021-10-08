package replit_practices.loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i =0; i<n;i++){ //2

            for (int j=0; j<i;j++){

                System.out.print("*");

            }

            System.out.println("*");
        }


    }
}
