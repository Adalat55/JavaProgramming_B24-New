package ExtraPractices;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a msg");
        String msg = input.next();
        String unique="";
        for(int i =0; i<msg.length();i++){
           if(!unique.contains(""+msg.charAt(i))){

               unique+=msg.charAt(i) ;
           }


        }
        System.out.println(unique);

    }
}
