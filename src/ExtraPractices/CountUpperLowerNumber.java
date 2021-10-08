package ExtraPractices;

import java.util.Scanner;

public class CountUpperLowerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String msg= input.nextLine();
        int upperCounter=0;
        int lowerCounter=0;
        int numberCounter=0;
        for(int i=0; i<msg.length();i++){

            if(msg.charAt(i)>='A'&&msg.charAt(i)<='Z'){
                upperCounter++;
            }
            if(msg.charAt(i)>='a'&&msg.charAt(i)<='z'){
                lowerCounter++;
            }

            if(msg.charAt(i)>='0'&&msg.charAt(i)<='9'){
                numberCounter++;
            }

        }
                        System.out.println(upperCounter);
                        System.out.println(lowerCounter);
                        System.out.println(numberCounter);
    }
}
