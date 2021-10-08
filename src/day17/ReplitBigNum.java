package day17;

import java.util.Scanner;

public class ReplitBigNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();

        if(n1>n2&&n1>n3){
            System.out.println(n1 +" is bigger");
        }else if(n2>n1&&n2>n3){
            System.out.println(n2+ " is bigger");
        }else if(n3>n1&&n3>n2){
            System.out.println(n3+ "is bigger");
        }

    }
}
