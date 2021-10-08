package day22_loops;

import java.util.Scanner;

public class ColourPicker {
    public static void main(String[] args) {

        /*
        pick 3 colours for the image

        colors need to be unique

         */
        Scanner input=new Scanner(System.in);

        String pickedcolours="";
        int colorspicked = 0;
while(colorspicked<3){

    System.out.println("enter color");
    String color = input.nextLine();

    if(pickedcolours.contains(color)){
        System.out.println("pick a different color");
    }else {

        pickedcolours += color + " ";
        colorspicked++;
    }



}

        System.out.println("you picked colors of "+pickedcolours);
    }
}
