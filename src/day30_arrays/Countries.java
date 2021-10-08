package day30_arrays;

public class Countries {
    public static void main(String[] args) {

        String[] countries= {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines","Armenia",  "Colombia","Honduras", "Indonesia", "United States", "Russia"};

       for(int i =0;i<countries.length;i++) {

           String each =countries[i].toUpperCase();
           System.out.println("Name of countries: "+each);
           System.out.println("First letter is: "+each.charAt(0));
           System.out.println("Last letter is: "+each.charAt(each.length()-1));

           System.out.println();
       }
        System.out.println("==============================================");
       for(String each: countries){

           each=each.toUpperCase();
           System.out.println("Name of countries: "+each);
           System.out.println("First letter is: "+each.charAt(0));
           System.out.println("Last letter is: "+each.charAt(each.length()-1));



       }





    }
}
