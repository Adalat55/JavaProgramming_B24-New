package ExtraPractices;

public class DivisibleBy {
    public static void main(String[] args) {
        String number = "";
        for (int i =0;i<=100;i++){
           if(i%2==1&&i%3==0&&i%5==0){
               number+=i+" ";
           }

        }

        System.out.println(number);

    }
}
