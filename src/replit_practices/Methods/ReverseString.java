package replit_practices.Methods;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String target) {
        String reversed="";
        for(int i=target.length()-1;i>=0;i--){
            reversed+=target.charAt(i);
        }

return reversed;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseString(in.next()));
    }
}
