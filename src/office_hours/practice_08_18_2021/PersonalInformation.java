package office_hours.practice_08_18_2021;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Hello, how many people do you live live?");
        int liveWithNumber= input.nextInt();
        if(liveWithNumber<=2&&liveWithNumber>=0){
            System.out.println("Thats nice");
        }else if (liveWithNumber>=3&&liveWithNumber<=6){
            System.out.println("you live with 3-6 people");
        }else if(liveWithNumber>6){
            System.out.println("Live with more than 6 people");
        }else{
            System.out.println("Invalid number of people");
        }
        input.nextLine();
        System.out.println("which city do you live in?");
        String cityName= input.nextLine();

        System.out.println("Do you live downtown?");
        String liveDowntown= input.next();

        if(liveDowntown.equalsIgnoreCase("yes")){
            System.out.println("Have you thought about moving to the suburbs?");
            String moveToSuburb = input.next();

            if(moveToSuburb.equalsIgnoreCase("yes")){
                System.out.println("do it, it's great");
            }else{
                System.out.println("You should think about it");
            }
        }
        input.nextLine();

        System.out.println("What is your favourite animal?");
        String animal = input.nextLine();
        System.out.println("Wow "+ animal+ " is a cool animal");

        System.out.println("how many pets do you want?");
        int numberOFPets= input.nextInt();

        System.out.println("Interesting, do you want "+numberOFPets+" "+animal);





    }
}
