package day07_unary_operators;

public class IncrementingDecrementing {

    public static void main(String[] args) {
        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println(B);
        System.out.println(A);

    }


}
