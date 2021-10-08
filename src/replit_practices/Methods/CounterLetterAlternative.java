package replit_practices.Methods;

public class CounterLetterAlternative {
    public static String countLetters(String str){

        int counter=0;
        String spaceAdded=str+" ";
        String result=""+str.charAt(0);
        for(int i=0; i<str.length();i++){
            counter++;
            if(!result.contains(""+str.charAt(i))) {
                result += counter + "" + str.charAt(i);
                counter=0;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(countLetters("aaaabbbccccc"));
    }
}
