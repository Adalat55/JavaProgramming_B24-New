package day17;

import java.util.Scanner;

public class replitMidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
int num1= input.nextInt();
        System.out.println("Enter second number:");
        int num2= input.nextInt();
        System.out.println("Enter third number:");
        int num3= input.nextInt();

        if(num1>num2&&num1<num3){
            System.out.println("medium valure is: "+num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("medium valure is: "+num2);
        }else if(num3>num1&&num3<num2){
            System.out.println("medium valure is: "+num3);
        }

    }
}
