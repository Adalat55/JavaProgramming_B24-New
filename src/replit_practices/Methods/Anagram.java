package replit_practices.Methods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1= "liste";
        String str2= "silent";
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String a="";
        String b="";

       for(char eachLetter: arr1){
           a+=eachLetter;  //
       }
        for(char eachLetter: arr2){
            b+=eachLetter;
        }
        if(a.equals(b)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
