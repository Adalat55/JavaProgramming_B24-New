package replit_practices.untill_loops;

import java.util.Scanner;

public class RelativeCheck {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter 1st full name");
        String firstFullName = input.nextLine();
        System.out.println("enter 2nd full name");
        String secondFullName = input.nextLine();
        int indexOf1stLastName=firstFullName.indexOf(" ");
        String firstLastName= firstFullName.substring(indexOf1stLastName+1);
        int indexOf2ndLastName=secondFullName.indexOf(" ");
        String secondLastName= secondFullName.substring(indexOf2ndLastName+1);

        System.out.println(firstLastName);

        if(firstLastName.equals(secondLastName)){

            System.out.println("related");
        } else {
            System.out.println("not related");
        }

    }
}
