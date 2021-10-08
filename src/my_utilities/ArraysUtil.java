package my_utilities;

public class ArraysUtil {

    public static int minNumber(int[] arr ){

        int min=arr[0];
        for(int each:arr){
            if(each<min){
                min=each;
            }
        }
            return  min;
    }

    public static int maxNumber(int[] arr ){
        int max=arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        return  max;

    }
    public static boolean contains(int[]arr, int num){

        for(int each: arr){
            if(each==num){
              return true;
            }

        }




        return false;

    }
    public static int countAppearance(String[] arr,String t){

        int counter=0;

        for(String  eachWord: arr){
            if(eachWord.equals(t)){
                counter++;
            }
        }
        return counter;

    }
    public static int sumOfElements(int [] arr){

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }
    public static int freguencyOfElements(int[] arr, int num){
        int counter=0;
        for(int each:arr){
            if(each==num){
                counter++;
            }
        }
        return counter;
    }
    public static void getUniqueElements(int[] nums){

        for(int each: nums){
           int counter=freguencyOfElements(nums, each);
           if(counter==1){
               System.out.println(each);
           }

        }


    }
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
    /*
    {1,2,3} , {4,5}
     */
public static int [] addElement(int[] arr, int[] elementsToAdd){
     int[] newArr=new int[arr.length+elementsToAdd.length];
    int index=0;

    for( int each: arr){
        newArr[index++]=each;
    }
    for(int each: elementsToAdd){
    newArr[index++]=each;
    }
return newArr;
}

}
