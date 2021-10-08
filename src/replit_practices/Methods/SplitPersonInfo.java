package replit_practices.Methods;

public class SplitPersonInfo {
    public static void person(String info) {
        //your code here
        String []arr =info.split(",");

        System.out.println("person name: "+arr[0]);
        System.out.println("last name: "+arr[1]);
        System.out.println("age: "+arr[2]);




    }
}
