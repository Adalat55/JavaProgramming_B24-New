package day38_methods;

public class IndexOfMethod {
   public static int returnIndex(int [] arr, int num){

       for(int i=0; i<arr.length;i++){
           if(arr[i]==num){
               return i;
           }
       }
       return -1;

   }
    public static int returnIndex(String [] arr, String word){

        for(int i=0; i<arr.length;i++){
            if(arr[i].equals(word)){
                return i;
            }
        }
        return -1;

   }

}
