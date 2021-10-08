package ExtraPractices;

import java.util.Scanner;

public class AverageNumberFromArr {
    public static void main(String[] args) {
        /*
        Given an int array calculate the average number-> Make it flexible so it will work with any array size Examples:[1,2,3] -> average: 2[10, 15, 5, 6] -> average: 9[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */
        Scanner input= new Scanner(System.in);
        System.out.println("enter a size");
        int size = input.nextInt();
        int[] numbers = new int[size];
        int total = 0;
        for(int i =0; i<size;i++){
            System.out.println("enter a number");
            numbers[i]= input.nextInt();
            total+=numbers[i];
        }

        System.out.println("average num: "+total/size);

    }
}
