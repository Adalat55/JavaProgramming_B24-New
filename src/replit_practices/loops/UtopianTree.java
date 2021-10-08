package replit_practices.loops;

public class UtopianTree {
    public static void main(String[] args) {
        int treeSize=0;
        int growthPerYear=0;
        for(int i =1; i<=10; i++){
            if(i<=3){
                growthPerYear=1;
               treeSize+=growthPerYear;
            }
            if(i>3){
                growthPerYear=2;
                treeSize+=growthPerYear;
            }
            System.out.println("year "+i+" - growth "+growthPerYear+ " cm");
            System.out.println("tree size: "+ treeSize+ "cm");
        }

    }
}
