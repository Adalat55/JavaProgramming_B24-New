package replit_practices.Methods;

public class CountWordsZY {
    public static int countYZ(String str) {

        str = str.toLowerCase(); // made it all lowercase to handle the case sensitivity
        int count = 0;

        for (int i = 0; i < str.length(); i++){

            if (!Character.isLetter(str.charAt(i))&&i>0){ //checking if character is not letter and character is not the first character in the string

                if (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z'){ //if character is not letter then checking if character before that is 'y' or 'z'   if true we count it
                    count++;
                }
            } else if( i==str.length()-1 ){  //here we checking if its the last character int the string and
                if(str.charAt(i)=='y'||str.charAt(i)=='z'){  //its 'y' or 'z' then we count it
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("!!day--yaz!!"));
    }
}
