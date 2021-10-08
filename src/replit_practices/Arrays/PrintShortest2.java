package replit_practices.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class PrintShortest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words=str.split(", ");
        String shortest =words[0];
        String sumOfShortest="";
        for( String each: words){
            if(each.length()<words[0].length()){
                shortest=each;
            }
        }
        for(String each: words){
            if(each.length()==shortest.length()){
                sumOfShortest+=each+", ";
            }
        }
        String[] shortestWords=sumOfShortest.split(", ");
        Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));

    }
}
