package day30_arrays;

public class GradeBook {
    public static void main(String[] args) {

        String [] studentNames={"james","jamie Fox","Luke Smith"};
        double [] studentGrade={90,80.5,100};

        for(int i =0; i < studentGrade.length;i++){
            System.out.println(studentNames[i]+ " -> "+studentGrade[i]);
        }



    }
}
