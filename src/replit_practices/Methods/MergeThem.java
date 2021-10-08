package replit_practices.Methods;

import java.util.Arrays;

public class MergeThem {
    public static String mergeStrings(String one, String two) {
        char [] arr1= one.toCharArray();
        char [] arr2= two.toCharArray();
        char [] merged= new char[arr1.length+arr2.length];
        String result ="";
        int index=0;
        for(int i =0; i< arr1.length;i++ ){

            merged[index]=arr1[i];
            index+=2;
        }

       return "1";

    }

    public static void main(String[] args) {
        String one="java";
        String two="selenium";
        char [] arr1= one.toCharArray();
        char [] arr2= two.toCharArray();
        char [] merged= new char[arr1.length+arr2.length];

        String result ="";
        int indexOfArr1=0;
        int indexOfArr2=1;
        for(int i =0; i< merged.length;i++ ){
            if(i<=arr1.length-1){
                merged[indexOfArr1]=arr1[i];
                indexOfArr1+=2;
            }
             indexOfArr1++;
           if(i<=arr2.length-1) {
               merged[indexOfArr2] = arr2[i];
               indexOfArr2 += 2;
           }
           indexOfArr2++;
       }

        System.out.println(Arrays.toString(merged));
        System.out.println(indexOfArr1);
        System.out.println(indexOfArr2);
    }
}
