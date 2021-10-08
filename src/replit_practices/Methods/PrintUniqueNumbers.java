package replit_practices.Methods;

public class PrintUniqueNumbers {
    public static void printUniqueNumbers(int [] nums){
        //WRITE YOUR CODE HERE
        int uniqueNumbers=0;
        for(int i=0; i< nums.length;i++){
            int counter=0;

            for(int j=0;j< nums.length;j++ ){
                if(nums[j]==nums[i]){
                    counter++;
                }
            }
            if(counter==1){
                uniqueNumbers=nums[i];
                System.out.println(uniqueNumbers);
            }

        }



    }

    public static void main(String[] args) {


    }
}
