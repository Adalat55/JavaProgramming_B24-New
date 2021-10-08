package day17;

import java.util.Scanner;

public class CitizenshipReplitTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seniorCitizens = 0;
        int nonSeniorCitizen=0;
        int age= 0;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens= input.nextInt();
        nonSeniorCitizen = input.nextInt();
        System.out.println("What is new citizen's age?");
        age= input.nextInt();
if(age>=65){
    System.out.println("Senior citizen");
    seniorCitizens++;
}else if(age<=65) {
    System.out.println("Non-Senior Citizen");
    nonSeniorCitizen++;
}
        System.out.println("New seniorCitizens count "+ seniorCitizens);
        System.out.println("New nonSeniorCitizens count " +nonSeniorCitizen);
    }
}
