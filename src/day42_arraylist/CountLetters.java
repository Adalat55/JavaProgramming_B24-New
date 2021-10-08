package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {


        // INPUT: AAAABBCCCDDDDDDEE
        //output: A4B2C3D6E2



    public static String countEachLetter( String str ) {
         String result="";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {

            if (!result.contains(each)) {
                int count = Collections.frequency(list, each);
                result += each + count;
            }
        }
        return result;
        }

    public static void main(String[] args) {

        System.out.println(countEachLetter("AAAABBCCCDDDDDDEE"));

    }

}
