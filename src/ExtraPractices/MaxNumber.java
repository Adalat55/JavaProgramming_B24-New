package ExtraPractices;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=240000000;
        int max=-240000000;
        int count = 1;

        while(count<=5){

            System.out.println("enter your number");
            int number=input.nextInt();
            count++;
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }


        }
        System.out.println("minimum number: "+min);
        System.out.println("maximum number: "+max);


    }
}
