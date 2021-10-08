package replit_practices.Methods;

public class CountLetters {
    public static String countLetters(String str){
        int counter=0;
        String spaceAdded=str+" ";
        String result="";
       for(int i=0; i<str.length();i++){
             counter++;
           if(spaceAdded.charAt(i)!=spaceAdded.charAt(i+1)) {
               result += counter + "" + spaceAdded.charAt(i);
               counter=0;
           }
       }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(countLetters("aaaabbbccccc"));
    }
}
