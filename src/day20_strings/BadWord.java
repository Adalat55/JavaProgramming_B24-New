package day20_strings;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your message");
        String msg = input.nextLine().toLowerCase();

        boolean badWords=msg.replace(" ","").contains("idiot") ||msg.replace(" ","").contains("dumb")|| msg.replace(" ","").contains("heck");
        if(badWords){
            System.out.println("message not sent");
        }else{
            System.out.println("message sent");
        }

    }
}
