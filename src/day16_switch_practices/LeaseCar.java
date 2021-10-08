package day16_switch_practices;

import java.util.Scanner;

public class LeaseCar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("which car make do you want?");
        String carMake = input.nextLine();
        System.out.println("which " + carMake + " do you want?");
        String carModel = input.nextLine();

        double leasePrice = 0;

        switch (carMake) {
            case "Lexus":
                if (carModel.equals("RX350")) {
                    leasePrice = 600;
                } else if (carModel.equals("LC500")) {
                    leasePrice = 900;
                } else if (carModel.equals("CT200H")) {
                    leasePrice = 350;
                }
                break;

            case "Cadillac":
                if (carMake.equals("Escalade")) {
                    leasePrice = 2000;
                } else if (carModel.equals("ATS")) {
                    leasePrice = 1500;
                }

                    break;

            default:
                System.out.println("we dont have " + carMake);

        }
        System.out.println("you can lease a " + carMake+" "+ carModel+ " for "+ leasePrice);
    }
}
