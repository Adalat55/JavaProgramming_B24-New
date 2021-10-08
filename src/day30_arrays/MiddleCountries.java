package day30_arrays;

public class MiddleCountries {
    public static void main(String[] args) {
        String[] countries={"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines","Armenia",  "Colombia","Honduras", "Indonesia", "United States", "Russia"};

        for(String country: countries){

            int mid= country.length()/2;

           if(country.length()%2==0){

               System.out.println(country.substring(mid-1,mid+1));



           }else {
               System.out.println(country.charAt(mid));
           }


        }





    }
}
