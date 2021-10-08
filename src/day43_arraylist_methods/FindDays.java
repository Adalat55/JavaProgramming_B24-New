package day43_arraylist_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {
    public static ArrayList<String> getDays(){

        String [] days={"Monday","Tuesday","wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return  daysInList;


        }
        public static String getDays(int day){
            String [] days={"Monday","Tuesday","wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));


            return daysInList.get(day-1);



        }

    public static void main(String[] args) {
        System.out.println(getDays(5));
    }
    }

