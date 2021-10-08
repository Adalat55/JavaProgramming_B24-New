package replit_practices.loops;

public class PrintEvenFrom80 {
    public static void main(String[] args) {

        for (int n =80;n>=20;n--){
            if(n%2==0){
                if(n==20){
                    System.out.println(n);
                }else{
                    System.out.print(n+" ");
                }

            }
        }
    }
}
