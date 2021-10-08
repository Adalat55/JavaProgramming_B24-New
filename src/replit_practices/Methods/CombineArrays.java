package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {
    public static ArrayList<String> combineRs(String[] r1, String[] r2){
        ArrayList<String> combined= new ArrayList<>();
        combined=new ArrayList<>(Arrays.asList(r1));

        combined.addAll(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));


return combined;


    }

    public static void main(String[] args) {


    }
}
