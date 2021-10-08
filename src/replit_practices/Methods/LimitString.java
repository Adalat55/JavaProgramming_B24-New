package replit_practices.Methods;

public class LimitString {
    public static String limit(String text, int maxLength){
        // your code
        String newVersion="";

        for(int i =0; i<maxLength;i++){
            newVersion+=text.charAt(i)+"";
        }

return newVersion;
    }
}
