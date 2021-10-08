package day45_constructors;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {

       NewEmployee one = new NewEmployee("James Bond",7, "SDET", 1_000_000);

        System.out.println(one);

        NewEmployee [] staff = new NewEmployee[3];

        staff[0]=one;
        staff[1]= new NewEmployee("Nadir", 10, "SDET", 300_000);

        System.out.println(Arrays.toString(staff));



    }
}
