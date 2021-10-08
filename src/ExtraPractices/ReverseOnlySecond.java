package ExtraPractices;

import java.util.Scanner;

public class ReverseOnlySecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message");
        String str= input.nextLine();
        String reversed="";
        String remaining="";
        String newVersion="";
        int spaceCount=0;    //I love java
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaceCount++;
                if(spaceCount==2){
                    for(int j=i;j>str.indexOf(' ');j--){
                        reversed+=str.charAt(j-1);
                    }
                         remaining+=str.substring(i+1);
                }
            }
        }   newVersion=str.substring(0,str.indexOf(' '))+" "+reversed+" "+remaining;

                System.out.println(newVersion);
    }
}
