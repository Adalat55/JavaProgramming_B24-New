package day11_if_statements;

public class ifPractice {
    public static void main(String[] args) {
        double hourlyRate = 10.5;
        double hoursWorked=45;
        double netPay;

        String message;

        if (hoursWorked>40){
            //this overtime calculation
            double overTimeHours = hoursWorked-40;
            netPay = 40*hourlyRate;
            netPay+=overTimeHours*1.5;

message= "Wow you worked "+ hoursWorked+ " hours so you got paid for " +overTimeHours+ " hours overtime, so your total net pay is: " +netPay;
            System.out.println(message );

        } else {
            netPay= hoursWorked*hourlyRate;
            message = "You worked "+ hoursWorked + " your total net pay is: "+ netPay;
            System.out.println(message);
        }

    }
}
