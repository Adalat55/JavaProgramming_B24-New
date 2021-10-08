package replit_practices.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {
    public static boolean isAnagram(String word1, String word2) {

        boolean isAnagram=true;

        char[] letters1=word1.toCharArray();
        Arrays.sort(letters1);
        char[] letters2=word2.toCharArray();
        Arrays.sort(letters2);

       return Arrays.equals(letters1,letters2);





    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine().toLowerCase(), in.nextLine().toLowerCase()));
    }
}
