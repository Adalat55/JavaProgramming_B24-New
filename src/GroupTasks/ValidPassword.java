package GroupTasks;

public class ValidPassword {
    /*
    Q7:- Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:

 1. Password MUST be at least have 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

If all requirements above are met, the method returns true, otherwise returns  false
     */

    public static boolean validPassword(String password) {

        boolean lowercase = false;
        boolean uppercase = false;
        boolean special = false;
        boolean digit = false;
        boolean length=false;
        boolean space = false;

        if(password.length()>=6){
            length=true;
        }
        if(!password.contains(" ")){
            space=true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                lowercase = true;
            } else if (Character.isDigit(password.charAt(i))) {
                digit = true;
            } else {
                special = true;
            }

        }
        if (length&& uppercase && lowercase && digit && special&&space) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(validPassword("Lalidpassword1@"));
    }
}

