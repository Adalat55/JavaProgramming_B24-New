package replit_practices.Methods;

public class WaterTax {
    public static double waterTax(double units){
        double bill=0;
        if(units<=50){
            bill=units*0.60;
        }
        if(units>50){
            bill=units*0.90;
            if(units>150){
                bill+=100;
            }
            else if(units>100){
                bill+=50;
            }
        }

      return bill;
    }

    public static void main(String[] args) {
        System.out.println(waterTax(151));
    }
}
