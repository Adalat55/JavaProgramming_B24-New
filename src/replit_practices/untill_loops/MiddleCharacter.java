package replit_practices.untill_loops;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        int length = word.length();
        int indexOfmiddleCharForEven =length/2-1;
        int indexOfmiddleCharforOdd = (length-1)/2;
        if(length%2==0){
            System.out.println(word.substring(indexOfmiddleCharForEven,indexOfmiddleCharForEven+2));
        }
        else if(length%2!=0){
            System.out.println(word.substring(indexOfmiddleCharforOdd,indexOfmiddleCharforOdd+1));
        }
    }
}
