package office_hours.practice_08_19_2021;

public class ArmyQualify {
    public static void main(String[] args) {
        String citizenship="canada";
        boolean resident=false;
        boolean highSchoolDiploma= true;
        int age = 35;

        if(citizenship.equalsIgnoreCase("us")||resident) {

            if (age >= 18 && age <= 35) {

                if (highSchoolDiploma) {
                    System.out.println("you are  qualified");
                } else {
                    System.out.println("you must have high school diploma");
                }


            } else {
                System.out.println("your age is must be between 18 to 35 years old");
            }
        }else {
            System.out.println("You must be citizen or a resident");
        }




    }
}
