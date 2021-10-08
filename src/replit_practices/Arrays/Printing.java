package replit_practices.Arrays;

import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++) {
            arr[i] = input.nextLine();
        }
        String each="";
        for(int i =0; i<arr.length;i++){
           each=arr[i];

            System.out.println(each.substring(0,3));

        }
    }
}
