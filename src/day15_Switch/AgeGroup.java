package day15_Switch;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 70;

        if(age>=0&&age<=129){

            if(age<=1){
                System.out.println("infant");
            }
            else if(age<=5){
                System.out.println("toddler");
            }
            else if(age<=9){
                System.out.println("kid");
            }
            else if(age<=12){
                System.out.println("pre-teen");
            }
            else if(age<=17){
                System.out.println("teenager");
            }
            else if(age<=20){
                System.out.println("young adult");
            }
            else if(age<=35){
                System.out.println("young adult");
            }
            else if(age<=55){
                System.out.println("middle age adult");
            }
            else{
                System.out.println("senior citizen");
            }


        } else {
            System.out.println("Invalid age number");
        }
    }
}
