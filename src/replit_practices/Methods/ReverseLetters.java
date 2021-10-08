package replit_practices.Methods;

public class ReverseLetters {
    public static void main(String[] args) {
      String  str = "Ab,c,de!$"; //0 1   3 4
        String reversed = "";
        int num =0;
        for (int i = str.length() - 1; i >= 0; i--){

            if (str.charAt(i) < '0'){ // we need all special. chars
                continue;
            }
           //str.charAt(num++) = str.charAt(i);
            // a,b$c output c,b$a
        }



    }
    }

