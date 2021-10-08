package ExtraPractices;

public class twoSum {
    public static void main(String[] args) {
        int [] arr= {2,4,7,8,9};   //sum->12

        int element1index=0;
        int element2index=0;


        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==12){
                   element1index=i;
                   element2index=j;
                   break;
                }

            }

        }
        System.out.println(element1index);
        System.out.println(element2index);



    }
}
