package office_hours.practice_09_15_2021;

public class LongestPalindrome {
    public static void main(String[] args) {

        /*
        Ex: Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]Output: racecarEx:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]Output: No palindrome
         */

        String[] arr ={"java", "longer word", "civic", "apple",  "racecar", "mom", "anna"};

        for(String eachWord: arr){

            String reversed="";
            for (int i =eachWord.length();i>=0;i--){
                reversed+=eachWord.charAt(i);
            }


        }


    }
}
