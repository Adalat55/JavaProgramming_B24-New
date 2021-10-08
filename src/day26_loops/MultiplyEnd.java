package day26_loops;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
       /*
       Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

    Ex:
        Input:
            Hello?
            3
        Output:
            Hello????
        */

        Scanner input =new Scanner(System.in);
        System.out.println("enter your text");
        String txt= input.nextLine();
        System.out.println("enter your number");
        int num = input.nextInt();


        char lastChar=txt.charAt(txt.length()-1);

        for(int i = 0; i<num; i++){

           txt+=txt.charAt(txt.length()-1);

        }
        System.out.println(txt);





    }
}
