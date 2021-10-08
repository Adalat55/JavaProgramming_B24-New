package replit_practices.untill_loops;

import java.util.Scanner;

public class SwapEmail {
    public static void main(String[] args) {
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
 */
        Scanner input=new Scanner(System.in);
      String email =input.nextLine();
      String firstName="";
      String lastName="";
      String newEmail="";
      int underScore=email.indexOf("_");
      int indexOfAt=email.indexOf("@");
      if(email.contains("_")){

        firstName+=email.substring(0,underScore);

        lastName+=email.substring(underScore+1,indexOfAt);

        newEmail+=lastName+"_"+firstName+email.substring(indexOfAt);

          System.out.println(newEmail);

      }else{
          System.out.println(email);
      }



    }
}
