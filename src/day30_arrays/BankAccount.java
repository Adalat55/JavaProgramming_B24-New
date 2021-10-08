package day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
/*
String array
0-First name
1-account number
2-balance
3-account type
 */
//        Scanner input =new Scanner(System.in);
//
//        String[] info = new String[4];
//
//        System.out.println("enter your first name");
//        info [0] =input.next();
//        System.out.println("enter acc number");
//        info [1] = input.next();
//        System.out.println("enter your balance");
//        info [2] = input.next();
//        System.out.println("enter acc type");
//        info [3] = input.next();


  //      System.out.println(Arrays.toString(info));

        System.out.println("==================================");

        String [] bankAccount = {"james Bond", "484948","$222288","checking"};
        System.out.println(Arrays.toString(bankAccount));
        System.out.println("==================================");

        String [] bankAccountTwo= new String[4];
        bankAccountTwo[3]="checking";
        bankAccountTwo[2]="$2222837";
        bankAccountTwo[1]="484948";
        bankAccountTwo[0]= "James Bond";

        System.out.println(Arrays.toString(bankAccountTwo));
        Scanner input =new Scanner(System.in);

        String [] bankAccountFour=new String [4];
        String [] questions = {"first", "account number","balance","account type"};

        for(int i =0; i<bankAccount.length;i++){

            System.out.println("enter your "+ questions[i]);
            bankAccountFour[i]=input.next();
        }


        System.out.println(Arrays.toString(bankAccountFour));



    }
}
