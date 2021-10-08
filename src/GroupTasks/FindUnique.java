package GroupTasks;

public class FindUnique {
    public static String uniqueChars(String str) {
        //Q4: String -- Find the unique
        //Write a return  method that can find the unique characters from the String
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


        String unique="";
        for(int i =0; i<str.length();i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (counter ==1 ) {
                unique += str.charAt(i);
            }
        }
       return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));

    }

}
