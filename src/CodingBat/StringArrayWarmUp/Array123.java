package CodingBat.StringArrayWarmUp;

public class Array123 {
    public static boolean appearance123(int [] arr){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==1&&arr[i+1]==2&&arr[i+2]==3){
                return true;
            }
        }
        return false;
    }
}
