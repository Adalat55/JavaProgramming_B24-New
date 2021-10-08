package replit_practices.Methods;

public class RemoveDuplicates {
    public static String removeDuplicates(String word) {
        String str="mama";
        String uniqueChars="";
        for(int i =0;i<str.length();i++){
               if(!uniqueChars.contains(str.charAt(i)+"")){
                   uniqueChars+=str.charAt(i);
               }
        }
        return uniqueChars;
    }
}
