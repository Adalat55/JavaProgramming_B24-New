package day32_Array;

import java.util.Scanner;

public class SplitPractice2 {
    public static void main(String[] args) {
        // string input : 3 words
        //reverse the middle one

        Scanner input = new Scanner(System.in);

        System.out.println("enter words");
        String str= input.nextLine();
        String [] arr = str.split(" ");
        String reverseWord="";
        for(int i =arr[1].length()-1; i>=0;i--){

            reverseWord+=arr[1].charAt(i);
        }
        System.out.println(arr[0]+" "+reverseWord+" "+arr[2]);
    }
}
