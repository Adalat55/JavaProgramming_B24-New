package day29_array;

public class LoopArray {
    public static void main(String[] args) {

        int[] nums ={1,2,3};
        int sumOfNumbers=0;

        for(int i = 0; i<nums.length;i++){

            sumOfNumbers+=nums[i];
        }

        System.out.println(sumOfNumbers);

    }
}
