package GroupTasks;

public class SameLetters {
    public static boolean sameLetters(String str1, String str2) {
        //Q2: String -- Same letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex:  same("abc",  "cab"); -> true
        //same("abc",  "abb"); -> false:

        //cheap way
//        char [] arr1= str1.toCharArray();
//        char [] arr2= str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        if(Arrays.equals(arr1,arr2)){
//           return true;
//        }
//        return false;
        //java    ajava


        if(str1.length()==str2.length()){

           for(int i =0;i<str1.length();i++) {
               if (!str2.contains(str1.charAt(i) + "")) {
                   return false;
               }
           }
           return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(sameLetters("alba","albaa"));
    }

}
