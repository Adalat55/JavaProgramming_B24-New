package day20_strings;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter username");
       String userName= input.next();
        System.out.println("enter password");
       String passWord= input.next();

       if(passWord.length()>=5){
           if(passWord.contains(userName)){
               System.out.println("username should not be in it");
               passWord="password";
               System.out.println("temporary password: "+passWord);
           }else{
               System.out.println("valid password");

           }
       } else{
           System.out.println("password can not be less than 5 characters");
       }



    }
}
