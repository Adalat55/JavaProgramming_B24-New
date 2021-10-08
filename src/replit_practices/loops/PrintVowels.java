package replit_practices.loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowels="a, e, i, o, u";
        String collectVowels="";
        for(int i=0; i<word.length();i++){

            if(vowels.contains(""+word.charAt(i))){
              collectVowels+=word.charAt(i);
            }

        }
        System.out.println(collectVowels);
    }
}
