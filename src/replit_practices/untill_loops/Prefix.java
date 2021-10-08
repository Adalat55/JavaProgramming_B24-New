package replit_practices.untill_loops;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String prefix= str.substring(0,n);
        String remainingStr= str.substring(n);
        if(remainingStr.contains(prefix)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }
}
