package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class  MergeThem {

    public static String mergeThem(String one, String two) {

        String  newStr="";

     if(one.length()<two.length()){
         for(int i =0; i<one.length();i++){
             newStr+=one.charAt(i)+""+two.charAt(i);
         }
         newStr+=two.substring(one.length());
     } else{
         for(int i =0; i<two.length();i++){
             newStr+=one.charAt(i)+""+two.charAt(i);
     }
         newStr+=one.substring(two.length());
     }
       return newStr;
}
    public static void main(String[] args) {
        System.out.println(mergeThem("java", "selenium"));
    }
}
