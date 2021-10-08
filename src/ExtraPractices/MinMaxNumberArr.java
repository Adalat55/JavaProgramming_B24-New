package ExtraPractices;

import java.util.Scanner;

public class MinMaxNumberArr {
    public static void main(String[] args) {

        /*
        •Write a program that can find the maximum number from any given int array•Write a program that can find the minimum number from any given int array
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int [] numbers = new int[size];
        for(int i = 0; i<size;i++) {

            System.out.println("enter numbers");
            numbers[i]= input.nextInt();
        }
        int max=numbers[0];
        int min=numbers[0];
        for(int i =0; i<size; i++){

            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("max number: "+max);
        System.out.println("min number: "+min);
    }
}
