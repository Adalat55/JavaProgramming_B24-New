package office_hours.practice_09_16_2021;

public class FirstAndLast {

    public static void main(String[] args) {

        String [] arr = {"apple", "tree", "shed", "marker", "pen"};

        for(String each: arr){

            System.out.println("first character: "+ each.charAt(0));
            System.out.println("last character: "+each.charAt(each.length()-1));
            System.out.println();
        }


    }

}
