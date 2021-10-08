package replit_practices.Methods;

public class FindError {
    public static boolean isError(String line) {
        boolean isError=false;
        if(line.startsWith("error")){
            isError=true;
        }


return  isError;


    }
}
