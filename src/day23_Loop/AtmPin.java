package day23_Loop;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validPin=1234;
        int userPin;
        int attempt=1;

        do{
            System.out.println("enter your pin");

            userPin= input.nextInt();
            attempt++;
        }while(userPin!=validPin&&attempt<=3);

        if(userPin==validPin){

        System.out.println("welcome, you are logged in");}
else{
            System.out.println("too many attempts");
        }

    }
}
