package day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {

        /*
        declare an int array
        count how many even number there is
        count how many odd numbers there is
        print your counters
                 */
       // int[] numbers={2,34,45,44,24,65,42,78,65,66};
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers you want to enter?");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for(int i=0; i< numbers.length;i++){

            System.out.println("enter your number");
            numbers [i]= input.nextInt();


        }


        int even=0;
        int odd=0;
        String evenNumbers="";
        String  oddNumbers="";
        for(int i = 0 ;i< numbers.length;i++){

          if(numbers[i]%2==0){
              even++;
              evenNumbers+=numbers[i]+" ";
          } else{
              odd++;
              oddNumbers+=numbers[i]+ " ";
          }

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("even: "+ even);
        System.out.println("even numbers: " + evenNumbers);
        System.out.println("odd: "+ odd);
        System.out.println("odd numbers: "+oddNumbers);

    }
}
