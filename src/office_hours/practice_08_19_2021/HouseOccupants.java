package office_hours.practice_08_19_2021;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the house type");
        String houseType = input.nextLine();
houseType=houseType.toLowerCase();
        int maxOccupants =0;

        switch (houseType) {
            case "tree house":
                maxOccupants = 1;
                break;
            case "mobile home":
                maxOccupants = 2;
            case "apartment":
                maxOccupants = 4;
                break;
            case "town house":
                maxOccupants = 6;
                break;
            case "villa":
                maxOccupants = 8;
                break;
            case "mansion":
                maxOccupants = 10;
                break;

        }

        if(maxOccupants>0){
            System.out.println("with a house type of "+houseType+ " you can have "+maxOccupants+ " people living there max");
        }else {
            System.out.println("invalid house type");
        }




    }
}
