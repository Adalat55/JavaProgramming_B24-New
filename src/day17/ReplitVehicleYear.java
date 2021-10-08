package day17;

import java.util.Scanner;

public class ReplitVehicleYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle year");
        int vehicleYear= input.nextInt();
        boolean isRecall =vehicleYear>=1995&&vehicleYear<=1998||vehicleYear>=2001&&vehicleYear<=2002||vehicleYear>=2004&&vehicleYear<=2006||vehicleYear>=2015&&vehicleYear<=2017;
        if(isRecall){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }
}
