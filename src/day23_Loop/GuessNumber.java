package day23_Loop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber=80;
        int  userGuess;
        int attempts=1;
        do {
            System.out.println("guess the number");
           userGuess = input.nextInt();
           attempts++;
       if(userGuess>0&&userGuess<100) {
           if (userGuess == secretNumber) {
               System.out.println("Good guess! The number was: " + secretNumber);
           } else if (userGuess < secretNumber) {
               System.out.println(userGuess + " is too small");
           } else if (userGuess > secretNumber) {
               System.out.println(userGuess + " is too big");
           }
       }else{
           System.out.println("too big number");
       }
    }while(userGuess!= secretNumber);
        if(attempts<=2){
            System.out.println("really good guess");
        }else if(attempts<=4){
            System.out.println("still good guess");
        }else {
            System.out.println(" a lot of guess but you got it");
        }



}}
