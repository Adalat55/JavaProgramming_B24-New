package ExtraPractices;

public class OddNumbers {
    public static void main(String[] args) {

        int total=0;
        for(int i=0;i<=100;i++){

            if(i%2==1){
                total+=i;
            }


        }
        System.out.println(total);

    }
}
