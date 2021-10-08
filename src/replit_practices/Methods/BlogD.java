package replit_practices.Methods;

import java.util.ArrayList;

public class BlogD {

    public static String blogDb(ArrayList<String[]> r, String id) {


        for( String [] eachArr: r){

            for(int i =0; i<eachArr.length;i++){

                if(id.equals(eachArr[i])){
                    return eachArr[i+1]+"\n"+eachArr[i+2];
                }
            }
        }
return "-1";

    }
}
