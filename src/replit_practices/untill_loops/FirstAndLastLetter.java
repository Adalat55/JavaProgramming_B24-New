package replit_practices.untill_loops;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter two words");
        String words = input.nextLine();
        String finalOutput="";


        finalOutput=words.substring(1,words.length()-1);

        System.out.println(finalOutput);
    }
}
