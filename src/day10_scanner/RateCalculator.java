package day10_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your salary");
        double salary = input.nextDouble();
        System.out.println("enter your weekly hours");
        int weeklyHour = input.nextInt();
        double hourlyRate = salary / (weeklyHour * 52);
        System.out.println("with a salary of " + salary + " weekly hours of " + weeklyHour+ " your hourly rate is " + hourlyRate);
    }
}
