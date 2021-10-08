package replit_practices.Methods;

public class CharAt3rd {
    public static String at3(String target,String word){

        String result="";

        result+=target.substring(0,3)+word+target.substring(3);


        return result;
    }
}
