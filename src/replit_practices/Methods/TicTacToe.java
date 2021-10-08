package replit_practices.Methods;

public class TicTacToe {
    public static void main(String[] args) {

        char[] arr = {'X','0','0',
                      '0','X','X',
                      'X','0','0'
                                    };
        for(int i=0;i<arr.length-2;i++) {
            if (arr[i]==arr[i+1]&&arr[i+1]==arr[i+2]&&arr[i+2]=='X') {
                if(i==0||i==3||i==6){
                System.out.println("X won");}
            }
            if (arr[i]==arr[i+1]&&arr[i+1]==arr[i+2]&&arr[i+2]=='0') {
                if(i==0||i==3||i==6){
                    System.out.println("0 won");}
            }
            if (arr[0]==arr[3]&&arr[3]==arr[6]&&arr[6]=='X') {
               System.out.println("X won");
            }

            if (arr[0]==arr[3]&&arr[3]==arr[6]&&arr[6]=='0') {
                System.out.println("0 won");
            }

            if (arr[0]==arr[4]&&arr[4]==arr[8]&&arr[8]=='X'||arr[i]==arr[2]&&arr[4]==arr[6]&&arr[6]=='X') {

               System.out.println("X won");
            }
            if (arr[i]==arr[i+4]&&arr[i+4]==arr[i+8]&&arr[i+8]=='0'||arr[i]==arr[i+2]&&arr[i+2]==arr[i+4]&&arr[i+4]=='0') {
                if(i==0||i==2){
                System.out.println("0 won");
                }
            }
        }
    }
}
