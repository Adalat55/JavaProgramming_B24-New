package replit_practices.Methods;

public class BookingAvailable {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // your code here //the room is already booked between 7/1/2018 - 7/8/2018 and not available
        boolean result = false;

        if (year == 2018) {
            if (isAvailable) {

                if (month != 7||day>8) {

                        result = true;

                }
            }
        }
        return result;
    }
}