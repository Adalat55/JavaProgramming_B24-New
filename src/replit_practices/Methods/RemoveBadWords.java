package replit_practices.Methods;

public class RemoveBadWords {
    public static String clean (String text , String badWord) {
        String[] arr= text.split(" ");
        String cleanString="";
        for(String each: arr){
            if (each.equals(badWord)) {

                continue;
            }else{
                cleanString+=each;
            }
        }
       return cleanString;
    }
}
