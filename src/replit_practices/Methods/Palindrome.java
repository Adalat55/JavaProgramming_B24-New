package replit_practices.Methods;

public class Palindrome {
    public static boolean isPalindrome(String check) {
        boolean palindrome=false;
        // your code here
        String spaceRemoved= check.replace(" ","").toLowerCase();
       for(int i =0;i<spaceRemoved.length()/2;i++){

           if(spaceRemoved.charAt(i)==spaceRemoved.charAt(spaceRemoved.length()-(i+1))){
               palindrome=true;
           }
       }

;
return palindrome;

    }
}
