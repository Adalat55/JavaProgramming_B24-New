package CodingBat.StringArrayWarmUp;

public class StringTimes {
    public static String stringTimes(String str, int num) {

        String stringTimes="";
        for(int i =0; i<num;i++){
            stringTimes+=str;
        }
        return stringTimes;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("hi",3));
    }
}
