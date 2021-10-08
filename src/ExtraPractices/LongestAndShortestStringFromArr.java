package ExtraPractices;

import java.util.Scanner;

public class LongestAndShortestStringFromArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a size");
        int size = input.nextInt();
        String [] str = new String[size];
        for(int i =0; i<size; i++) {
            System.out.println("enter string");
            str[i] = input.next();
        }
            String longest = str[0];
            String shortest = str[0];

        for(String each:str){
            if (each.length() > longest.length()) {
                longest=each;
            }
            if(each.length()<shortest.length()){
                shortest=each;
            }
            }

        System.out.println("longest: "+longest);
        System.out.println("shortest: "+shortest);
    }
}
