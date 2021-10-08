package day39_wrapper_arraylist;

import java.util.Scanner;

public class ParseExamples {
    public static void main(String[] args) {


        String year = "2009";
        System.out.println(year+1);

        int intYear=Integer.parseInt(year);

        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year+1);
        System.out.println(intYear+1);

        /*ask the user to enter some text
        i am x years old
        in 5 years you will be : 4age
         */

        Scanner input=new Scanner(System.in);

        System.out.println("enter your age");
        String text= input.nextLine();

      String ageText= text.split(" ")[2];

      int age =Integer.parseInt(ageText);
        System.out.println("in 5 year you will be "+(age+5));

        String priceStr="112.99";
        double priceDouble=Double.parseDouble(priceStr);
        System.out.println(priceDouble);

    }
}
