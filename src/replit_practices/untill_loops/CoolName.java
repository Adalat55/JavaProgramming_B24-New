package replit_practices.untill_loops;

import java.util.Scanner;

public class CoolName {
    /*
    Declare a variable name. You will check if it is a cool name.-If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”-If the name ends with 'm' print "Almost cool"-Otherwise print “Sorry not a cool name”
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eneter your name");
        String name = input.nextLine();

        if(name.charAt(0)=='a'||name.charAt(0)=='z'){
            System.out.println("your name is cool");
        }
        else if(name.charAt(name.length()-1)=='m'){
            System.out.println("almost cool name");

        }else {
            System.out.println("sorry, not cool name");
        }
    }
}
