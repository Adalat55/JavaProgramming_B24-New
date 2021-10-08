package day30_arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        String[] countries={"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines Nation","UAE","Armenia",  "Colombia","Honduras", "Indonesia", "United States", "Russia"};

        String largest=countries[0];
        String smallest=countries[0];
        for(int i =0; i<countries.length;i++) {



            if (countries[i].length() > largest.length()) {
                largest = countries[i];

            }
            if (countries[i].length() < smallest.length()) {

                 smallest = countries[i];
            }
        }
        System.out.println("largest " +largest);
        System.out.println("smallest "+smallest);



        for(String each:countries) {

            if (each.length() > largest.length()) {
                largest = each;

            }
            if (each.length() < smallest.length()) {

                smallest =each;
            }
        }
            System.out.println("largest " +largest);
            System.out.println("smallest "+smallest);




    }
}
