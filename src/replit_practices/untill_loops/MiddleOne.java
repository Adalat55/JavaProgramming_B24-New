package replit_practices.untill_loops;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int length = word.length();

        if(length%2!=0){
            if(length>=3){
            System.out.println(word.charAt((length-1)/2));
            } else if(length==1){
                System.out.println(""+word+word+word);
            }
        }
        if(length%2==0){
            if(length>=4){
                System.out.println(word.substring(length/2-1,length/2+1));
            } else if(length==2){
                System.out.println(""+word+word);
            }
        }
    }
}
