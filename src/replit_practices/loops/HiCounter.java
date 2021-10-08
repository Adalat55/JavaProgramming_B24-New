package replit_practices.loops;

import java.util.Scanner;

public class HiCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int counter=0;
        for(int i =0; i<str.length();i++){

            if(str.charAt(i)=='h'&& str.charAt(i+1)=='i'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
