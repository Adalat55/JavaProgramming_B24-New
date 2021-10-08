package GroupTasks;

public class SumOfDigits {
    public static int sumOfNumbers(String str) {
        /*
        Q8:- Sum of digits in a string
Write a method that can return the sum of the digits in a string
         */
       // ex: "12334"
        int sum=0;
        for(int i =0; i<str.length();i++){
          sum+=Integer.parseInt(str.charAt(i)+"");

        }

       return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("123455"));
    }
}
