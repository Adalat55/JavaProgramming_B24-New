package replit_practices.untill_loops;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()<6){
            System.out.println("invalid");
        }
         else if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
                System.out.println(!exists);
            }

        else{
            System.out.println(exists);
        }



    }
}
