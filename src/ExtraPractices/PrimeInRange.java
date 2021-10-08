package ExtraPractices;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();
        String primeNumbers="";

        for(int i=2;i<num;i++){
            int counter=0;

            for(int j=1;j<=num;j++){
                if(i%j==0){
                    counter++;
                }
            }  if(counter==2){
                    primeNumbers+=i+" ";
            }
        }
        System.out.println(primeNumbers);
    }
}
