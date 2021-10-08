package day20_strings;

public class AccountNumber {
    public static void main(String[] args) {

        String accountNUmber= "5334145456";

        if(accountNUmber.startsWith("2")){
            if(accountNUmber.length()==7){
                System.out.println("valid 7 digit account number");
            }else {
                System.out.println("invalid 7 digit account number");
            }


        }else if (accountNUmber.startsWith("5")){
            if(accountNUmber.length()==10){
                System.out.println("valid 10 digit account number");
            }else{
                System.out.println("invalid 10 digit account number");
            }
        }else {
            System.out.println("invalid account number. It needs to start with 2 or 5");
        }



    }
}
