package day09_Scanner;

public class ReviewOperators {
    public static void main(String[] args) {

        double budget = 1000;

        budget -= 200;

        boolean stillInBudget = budget >= 0;
        System.out.println("Budget after purchase: "+ budget);
        System.out.println( "Still in budget: " + stillInBudget);

        budget -= 5000;
        stillInBudget = budget >= 0;
        System.out.println("Budget after purchase: "+ budget);
        System.out.println( "Still in budget: " + stillInBudget);

        int i=5;
        boolean b = (i =3) == 5;
        System.out.println(b);
        System.out.println(i);

    }
}
