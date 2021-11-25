package GroupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortLetters {
    //Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    //
    //Example:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        char[] arr = str.toCharArray();
        String letters = "";
        String digits = "";
        String str1 = "";
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= 9 && i < arr.length - 1) {

                list.add(arr[i]);
                Collections.sort(list);
            }
        }


        System.out.println(list);


    }

}