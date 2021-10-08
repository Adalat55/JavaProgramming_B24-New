package replit_practices.Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int counter=0;
       for(int i =0; i<email.length();i++ ){
           if(email.charAt(i)=='@') {
               counter++;
           }
       }
       if(counter==1){

            String[] separated = email.split("@");

            System.out.println("email id: " + separated[0]);
            System.out.println("Email domain: " + separated[1]);
       }
       else{
           System.out.println("invalid email");
       }
    }
}
