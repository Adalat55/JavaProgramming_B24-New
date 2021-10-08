package day43_arraylist_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {
    public static void main(String[] args) {

        System.out.println(getUniqueElements(new ArrayList<>(Arrays.asList(3,4,5,5,4))));
    }
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer>  list){

        ArrayList<Integer> unique = new ArrayList<>();

        for(int each : list){

           int count = Collections.frequency(list,each);

            if(count==1){
                unique.add(each);
            }
        }

    return  unique;

    }
}
