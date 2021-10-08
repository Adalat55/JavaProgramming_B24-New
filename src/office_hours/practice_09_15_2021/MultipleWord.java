package office_hours.practice_09_15_2021;

public class MultipleWord {

    public static void main(String[] args) {
        /*
        Given a String of words that are separate by commas. Find and print any words that have more than one wordExampleInput: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”Output: wooden spoonstrash candish washer
         */

       String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

       String [] arr=str.split(", ");
        String multipleWords="";
       for(String each: arr){

           if(each.contains(" ")){
               System.out.println(each);
           }

       }




    }

}
