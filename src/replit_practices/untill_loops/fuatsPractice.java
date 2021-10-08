package replit_practices.untill_loops;

import java.util.Scanner;

public class fuatsPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        int length = word.length();
        int indexOfmiddleChar = length/2; //peach  //aple

        if(length%2==0 ){
            System.out.println(word.substring(indexOfmiddleChar/2,indexOfmiddleChar+2));
        }if(length%2!=0){
            System.out.println(word.substring(indexOfmiddleChar,indexOfmiddleChar+1));
        }
}}

