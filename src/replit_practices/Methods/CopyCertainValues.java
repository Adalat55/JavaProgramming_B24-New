package replit_practices.Methods;

import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {
        String wordsWithE="";
        String []arr={"zero", "one", "two","three","four"};
        for(String each: arr){
            if(each.contains("e")){
                wordsWithE+=each+", ";
            }
        }
        String [] newArr=wordsWithE.split(", ");
        System.out.println(Arrays.toString(newArr));
    }
}
