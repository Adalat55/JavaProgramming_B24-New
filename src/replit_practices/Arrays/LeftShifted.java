package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShifted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); //input: 6, 2, 5, 3
        int[] nums = new int[size];//output: [2, 5, 3, 6]
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        int[] newNums=new int[size];
        for(int i = 0; i < size-1; i++) {
            newNums[i]=nums[i+1];
        }
        System.out.println(Arrays.toString(newNums));

        }

    }

