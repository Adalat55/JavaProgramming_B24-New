package replit_practices.Methods;

public class WithoutLength {
    public static void main(String[] args) {

        String str = "Helloworld";
        char [] arr =str.toCharArray();
        int count =0;
        for(char each: arr){
            count++;
        }
        System.out.println(count);
    }
}
