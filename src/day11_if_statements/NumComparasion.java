package day11_if_statements;

public class NumComparasion {
    public static void main(String[] args) {
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







