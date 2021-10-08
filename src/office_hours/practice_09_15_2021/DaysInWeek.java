package office_hours.practice_09_15_2021;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        make a method that will accept a number
        i want to know which day of the week it is
        1-minday
        2- tuesday
        ...
         */
        System.out.println( getDayOfWeek(2));
        String day2= getDayOfWeek(10);
        System.out.println(day2);


    }
        public static String getDayOfWeek (int number) {
            String day = "";
            switch (number) {
                case 1:
                    day = "monday";
                    break;
                case 2:
                    day = "tuesday";
                    break;
                case 3:
                    day = "wednesday";
                    break;
                case 4:
                    day = "thursday";
                    break;
                case 5:
                    day = "friday";
                    break;
                case 6:
                    day = "saturday";
                    break;
                case 7:
                    day = "sunday";
                    break;
            }

return day;
        }

}

