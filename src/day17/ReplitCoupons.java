package day17;

import java.util.Scanner;

public class ReplitCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of coupons");
        int coupons = input.nextInt();
        int candies = coupons/10;
        int gumballs = coupons/3;
        if (coupons>=0) {
            if (coupons / 10 >= 1) {
                System.out.println("Number of Candies: " + candies);
                System.out.println("Number of Gumballs: " + (coupons % 10 / 3));
            } else if (coupons / 3 >= 1) {
                System.out.println("Number of Candies: " + (coupons / 10));
                System.out.println("Number of Gumballs:" + (coupons / 3));
            } else {
                System.out.println("Not enough coupons");
            }
        }else {
            System.out.println("invalid coupon number");
        }
    }
}
