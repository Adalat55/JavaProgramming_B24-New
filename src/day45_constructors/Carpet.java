package day45_constructors;

public class Carpet {

    /*
    info:
        width, length, unit price, if its persian, total price

        constructor :
        initialize variables

        calculate the total price

        toString to print the total price


     */

   int width;
   int length;
   double unitPrice;
   boolean isPersian;
   double total;

   public Carpet(int carpetWidth, int carpetLength, double carpetPrice, boolean persianCarpet){

       width=carpetWidth;
       length=carpetLength;
       unitPrice=carpetPrice;
       isPersian=persianCarpet;
       total = width*length*unitPrice+(isPersian? +200: 0);
   }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", total price: "+total;
    }

    public static void main(String[] args) {
        Carpet carpetOne= new Carpet(10, 3, 2, true);
        System.out.println(carpetOne);
    }

}
