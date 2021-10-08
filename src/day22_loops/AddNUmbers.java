package day22_loops;

import java.util.Scanner;

public class AddNUmbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total =0;
        boolean positiveNumber =true;

        while (positiveNumber){

            System.out.println("enter a number: ");
            int number = input.nextInt();


            if(number<0){
                positiveNumber=false;
            }else{
                total+=number;
            }
            System.out.println(total);
        }

    }
}
