package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String each="";
        String[] newWords= new String[words.length];
        for(int i =0; i < words.length;i++){
            each=words[i];
            newWords[i]=each.charAt(0)+""+each.charAt(each.length()-1);

        }
        System.out.println(Arrays.toString(newWords));

    }
}
