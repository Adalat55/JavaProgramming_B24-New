package my_utilities;

public class StringUtil {

    public static void main(String[] args) {
        String str = "sentence";

        String word = reverse("java");
        System.out.println(word);
    }

    /*
    Reverse method
     it will accept the String parameter and return the reverse version of the string
     */

    public static String reverse(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }

    /*
    method will accept the string and returns the string in proper format
     */
    public static String fixFormat(String word) {

        String fixedFormat = "";

        fixedFormat += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

return fixedFormat;

}
    public static int frequencyOfChar(String word, char letter){
        int counter=0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==letter){
                counter++;
            }
        }
        return counter;
    }
    public static String getDuplicateCharacters(String str){ // java

        String allDuplicate = "";

        for(int i = 0; i < str.length(); i++){

            int count = frequencyOfChar(str, str.charAt(i));

            if(count > 1){
                allDuplicate += str.charAt(i);
            }

        }

        return allDuplicate;

    }
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