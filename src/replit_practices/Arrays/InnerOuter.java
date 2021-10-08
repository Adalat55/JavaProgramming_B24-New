package replit_practices.Arrays;

import java.util.Scanner;

public class InnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers for outer array");
        int[] outer = new int[scan.nextInt()];
        System.out.println("how many nums for inner array");
        int[] inner = new int[scan.nextInt()];
        int counter=0;
        for(int j = 0; j < outer.length; j++) {
            System.out.println("outer nums");
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            System.out.println("inner nums");
            inner[i] = scan.nextInt();
        }                               // 1, 2, 4, 6
                                        //2, 4
        for(int j =0;j< outer.length;j++){

            for(int i =0; i<inner.length;i++){
                if(inner[i]==outer[j]){
                        counter++;
                }
            }

        }
        if(counter== inner.length){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
