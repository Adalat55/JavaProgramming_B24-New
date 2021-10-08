package ExtraPractices;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a string");
        String msg= input.nextLine();
        String ascii="";
        for(int i =0;i<msg.length();i++){
            ascii+=(int)msg.charAt(i)+" ";
        }

        System.out.println("ascii numbers for \""+msg+ "\" is "+ascii);

    }
}
