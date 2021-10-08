package ExtraPractices;

import java.util.Scanner;

public class EvenAndOddFromArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a size");
        int size = input.nextInt();
        int[] numbers= new int[size];
        int evenCounter=0;
        int oddCounter=0;
        for(int each: numbers){
            System.out.println("enter a number");
           each= input.nextInt();
            if(each%2==0){
               evenCounter++;
            }else{
                oddCounter++;
            }
        }

        System.out.println("evens: "+evenCounter);
        System.out.println("odds: "+oddCounter);
    }
}
