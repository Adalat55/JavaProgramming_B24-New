package replit_practices.Arrays;

import java.util.Scanner;

public class PrintFirstAndLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String each="";
        for(int i =0; i<words.length;i++){

            each=words[i];
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        }


    }
}
