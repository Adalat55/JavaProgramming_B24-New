package day13_if_statements;

public class fizzbuzz {
    public static void main(String[] args) {

        int number =7;

        if (number%3==0 && number%5==0){
            System.out.println("fizzbuzz");
        }

        else if (number%3==0){
            System.out.println("fizz");
        }
        else if (number%5==0){
            System.out.println("buzz");

        }

    }
}
