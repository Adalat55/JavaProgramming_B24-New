package day11_if_statements;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {

        int x;
        int y=20;
        if(y==20){ x=5;
        }

        int fees;
        boolean max = true;
        if(max==true){ fees = 50;
            System.out.println(fees);
        }
//-  Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100
        int a;
        int b=50;
        int c=120;
        if(b==50 && c>=100){a=20;

        }
        int temp = 76;
        if(temp>70 && temp<80){
            System.out.println("Ideal temp");
        }

        boolean B = true;

        System.out.println(!B);


/*
Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean). If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.

 */
        Scanner input = new Scanner(System.in);

        int salary = 90000;
        System.out.println("Are you full time worker? true or false");
        boolean isFullTime = input.nextBoolean();
        if(isFullTime==true) {
            salary += 20000;
            System.out.println("You are full time worker so your salary is $" + salary);
        } else {

            salary-=5000;
            System.out.println(" you are a part time worker so your salary is $"+ salary);
        }

        int num1 =4;
        int num2=8;
        int num3=1;

        if(num1>num2&&num1>num3){
            System.out.println(num1 + " is greater than "+ num2+ " and "+num3);}

            if(num2>num1&&num2>num3){
                System.out.println(num2 + " is greater than "+ num1+ " and "+num3);}


if(num3>num1&&num3>num2){
    System.out.println(num3 + " is greater than "+ num1 +" and "+num2);
}


    }
}
