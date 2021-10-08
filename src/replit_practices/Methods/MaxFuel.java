package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxFuel {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        int fuelTimes=0;
    for(int j=0; j< deliveries.size();j++) {

            fuelTimes+=deliveries.get(j) / max_fuel;
            if(deliveries.get(j)/max_fuel<1){
                fuelTimes++;
            }
        }



return fuelTimes;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }
}
