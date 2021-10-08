package replit_practices.untill_loops;

import java.util.Locale;
import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine().toLowerCase(Locale.ROOT);


        if(a.contains("alejandro")){
            System.out.println("read");
        } else {
            System.out.println("don't read");
        }




    }
}
