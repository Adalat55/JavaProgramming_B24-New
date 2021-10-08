package day13_if_statements;

public class StringCompare {
    public static void main(String[] args) {
        String city= "Chicago";

        if(city.equals("McLean")){
            System.out.println("City is Virginia");
        } else {
            System.out.println("City is not in Virginia");
        }
        if (city.equals("Chicago")){
            System.out.println("city is in Illinois");
        }else{
            System.out.println("city is not in Illinois");
        }
        String str = "java";
        String str2 = "java";

        if(!str.equals(str2)){
            System.out.println("strings are not equal");
        }else {
            System.out.println("strings are equal");
        }

    }
}
