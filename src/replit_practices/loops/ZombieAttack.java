package replit_practices.loops;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int days =0; //6


while(inhabitants>0){

    System.out.println("day "+days+"["+inhabitants+"]");
    inhabitants/=2;


    days++;

}

    }
}
