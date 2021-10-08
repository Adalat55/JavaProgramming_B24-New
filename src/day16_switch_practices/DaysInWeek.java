package day16_switch_practices;

public class DaysInWeek {
    public static void main(String[] args) {
        int day= 8;

        String dayInWords="";

        switch(day){

            case 1: dayInWords = "monday";break;
            case 2: dayInWords = "tuesday";break;
            case 3: dayInWords = "wednesday";break;
            case 4: dayInWords = "thursday";break;
            case 5: dayInWords = "friday";break;
            case 6: dayInWords = "saturday";break;
            case 7: dayInWords = "sunday";break;
            default: dayInWords ="Invalid day number. Needs to be 1-7";

        }
        System.out.println(day);
        System.out.println(dayInWords);

    }
}
