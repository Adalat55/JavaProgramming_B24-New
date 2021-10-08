package day06_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 4;

        double addResult = num1 +num2;
        double subResult = num1-num2;
        double multiResult= num1*num2;
        double divResult = num1/num2;
        double remainResult = num1 % num2;

        System.out.println(num1+ " + " +num2+"="+ addResult);
        System.out.println(num1+ " - " +num2+"="+ subResult);
        System.out.println(num1+ " * " +num2+"="+ multiResult);
        System.out.println(num1+ " / " +num2+"="+ divResult);
        System.out.println(num1+ " % " +num2+"="+ remainResult);


        System.out.println(num1+ " + " +num2+"="+ num1 + num2);

        System.out.println(num1+ " * " +num2+"="+ multiResult);
        System.out.println(num1+ " / " +num2+"="+ divResult);
        System.out.println(num1+ " % " +num2+"="+ remainResult);

        System.out.println("java"+ (5+4));






    }



}
