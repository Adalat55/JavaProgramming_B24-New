package replit_practices.untill_loops;

import java.util.Scanner;

public class MinAndMaximumNumber {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter numbers");
        int num1 = input.nextInt();
        int num2= input.nextInt();
       int sum=num1+num2;
        while(num1>=0&&num2>=0){
            System.out.println(sum);
        }


        }

    }


