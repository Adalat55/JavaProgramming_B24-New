package day39_wrapper_arraylist;

import java.util.Scanner;

public class ApplyMethods {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String email= input.nextLine();
        int counterUppercase=0;
        int counterLowercase=0;
        int counterNumbers=0;
        int otherCharacters=0;
        for(int i=0;i<email.length();i++){
            if(Character.isUpperCase(email.charAt(i))){
                counterUppercase++;
            }
            if(Character.isLowerCase((email.charAt(i)))){
                counterLowercase++;
            }
            if(Character.isDigit((email.charAt(i)))){
               counterNumbers++;
            }
            if(!Character.isDigit((email.charAt(i)))&&!Character.isUpperCase(email.charAt(i))&&!Character.isDigit((email.charAt(i)))){
                otherCharacters++;
            }
        }
        System.out.println(counterLowercase);
        System.out.println(counterUppercase);
        System.out.println(counterNumbers);
        System.out.println(otherCharacters);
    }
}
