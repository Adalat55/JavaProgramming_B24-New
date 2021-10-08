package day05_variables;

public class CastingExamples {

    public static void main(String[] args) {

        long number= 90; //type is int, casts to long automatically
        long number2 = 100L;
        short number3 = 10;
        float number4= number3;
        System.out.println(number4);
        //bigger to smaller

        long number5 = 11;

        int number6 =(int)number5;

    }


}
