package replit_practices.Methods;

public class PrintDuplicates {
    public static void main(String[] args) {

        int [] arr = {1, 2, 5, 7, 2, 5, 9, 7};
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
