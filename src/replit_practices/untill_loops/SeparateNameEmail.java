package replit_practices.untill_loops;

import java.util.Scanner;

public class SeparateNameEmail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName="";
        String lastName ="";
        String domain="";
        String properFirstName="";
        String properLastName="";
        firstName+=email.substring(0,email.indexOf("_"));

        lastName+=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        domain+=email.substring(email.indexOf("@")+1,email.indexOf("."));

properFirstName+=firstName.substring(0,1).toUpperCase()+firstName.substring(1);

properLastName+=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("First name: "+properFirstName);
        System.out.println("Last name: "+properLastName);
        System.out.println("Domain: "+ domain);



    }
}
